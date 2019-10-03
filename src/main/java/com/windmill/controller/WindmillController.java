/**
 * 
 */
package com.windmill.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.windmill.constants.WindmillConstants;
import com.windmill.entity.WindmillAvgDetails;
import com.windmill.entity.WindmillDetails;
import com.windmill.service.IWindmillService;
import com.windmill.util.WindmillUtil;

/**
 * @author JEYALAKSHMIV
 *
 */
@RestController
public class WindmillController {

	/**
	 * instantiate the logger
	 */
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(WindmillController.class);
	
	/**
	 * instantiate the windmillService interface
	 */
	@Autowired
	IWindmillService windmillService;

	/**
	 * @param windmillDetails
	 * @return Map<String, Object>, successful reponse of the windmill registration
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@PostMapping("/windmill/registeration")
	public Map<String, Object> registerWindmill(@RequestBody String windmillDetails)
			throws JsonParseException, JsonMappingException, IOException {
		logger.info("Entered in the registeration service contorl");
		WindmillDetails windDetails = WindmillUtil.getMapperInstance().readValue(windmillDetails,
				WindmillDetails.class);
		WindmillDetails millResponse = windmillService.registerWindmill(windDetails);
		Map<String, Object> finalResponse = new HashMap<String, Object>();
		finalResponse.put("response", millResponse);
		finalResponse.put("responseMeassage", WindmillConstants.WINDMILL_REGISTERED);
		logger.info("returned   registeration service response" + finalResponse.toString());
		return finalResponse;
	}

	/**
	 * @param uniqueId
	 * @return List of the details required for the chart creation
	 */
	@GetMapping("/windmill/chartData")
	public List<WindmillAvgDetails> generateChartReport(@RequestParam String uniqueId) {
		logger.info("Entered in the chartdata service contorl" + uniqueId);
		List<WindmillAvgDetails> avgDetails = windmillService.getChartData(uniqueId);
		return avgDetails;

	}

}
