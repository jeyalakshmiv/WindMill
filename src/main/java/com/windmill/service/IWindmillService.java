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

	WindmillDetails registerWindmill(com.windmill.entity.WindmillDetails windDetails);
	List<WindmillAvgDetails> getChartData(String uniqueId);
}
