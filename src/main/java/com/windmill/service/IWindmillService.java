/**
 * 
 */
package com.windmill.service;

import java.util.List;

import com.windmill.entity.WindmillAvgDetails;
import com.windmill.entity.WindmillDetails;

/**
 * @author JEYALAKSHMIV
 *
 */
public interface IWindmillService {

	/**
	 * @param windDetails
	 * @return
	 */
	WindmillDetails registerWindmill(com.windmill.entity.WindmillDetails windDetails);
	/**
	 * @param uniqueId
	 * @return
	 */
	List<WindmillAvgDetails> getChartData(String uniqueId);
}
