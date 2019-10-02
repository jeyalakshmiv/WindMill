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

	WindmillDetails registerWindmill(WindmillDetails windmillDetails);

	void saveEnergyDetails(WindmillEnergyDetails energyDetails);

	List<WindmillAvgDetails> getChartData(String uniqueId);

}
