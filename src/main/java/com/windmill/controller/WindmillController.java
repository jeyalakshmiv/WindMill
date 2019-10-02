/**
 * 
 */
package com.windmill.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Controller
public class WindmillController {
	//private static final Logger logger = LogManager.getLogger(WindmillController.class);
	
	@Autowired
	IWindmillService windmillService;
	
	
	@PostMapping("/windmill/registeration")
	public Map<String, Object> registerWindmill(
			 @RequestBody String windmillDetails) throws JsonParseException, JsonMappingException, IOException {
		WindmillDetails windDetails = WindmillUtil.getMapperInstance().readValue(windmillDetails, WindmillDetails.class);
		WindmillDetails millResponse = windmillService.registerWindmill(windDetails);
		Map<String, Object> finalResponse = new HashMap<String,Object>();
		finalResponse.put("response",millResponse);
		finalResponse.put("responseMeassage", WindmillConstants.WINDMILL_REGISTERED);
		
        return finalResponse;
	}	
	@GetMapping("/windmill/chart/")
	public String generateChartReport(ModelMap modelMap) {
		List<WindmillAvgDetails>  avgDetails = windmillService.getChartData("123");
			
			modelMap.addAttribute("avgList", avgDetails);
			return "index";
		
	}
	 @RequestMapping("/")
	    public String home(Map<String, Object> model) {
	        model.put("message", "HowToDoInJava Reader !!");
	        return "home";
	    }

}
