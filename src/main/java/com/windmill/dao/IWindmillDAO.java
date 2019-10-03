/**
 * 
 */
package com.windmill.dao;

import java.util.List;

import com.windmill.entity.WindmillAvgDetails;
import com.windmill.entity.WindmillDetails;
import com.windmill.entity.WindmillEnergyDetails;

/**
 * @author JEYALAKSHMIV
 *
 */
public interface IWindmillDAO {

	/**
	 * @param windmillDetails
	 * @return
	 */
	WindmillDetails registerWindmill(WindmillDetails windmillDetails);

	/**
	 * @param energyDetails
	 */
	void saveEnergyDetails(WindmillEnergyDetails energyDetails);

	/**
	 * @param uniqueId
	 * @return
	 */
	List<WindmillAvgDetails> getChartData(String uniqueId);

}
