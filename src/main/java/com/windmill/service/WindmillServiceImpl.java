/**
 * 
 */
package com.windmill.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.windmill.constants.ErrorCodes;
import com.windmill.constants.WindmillConstants;
import com.windmill.dao.IWindmillDAO;
import com.windmill.entity.WindmillAvgDetails;
import com.windmill.entity.WindmillDetails;
import com.windmill.exception.WindmillValidationException;


/**
 * @author JEYALAKSHMIV
 *
 */
@Service
@Transactional
public class WindmillServiceImpl implements IWindmillService {
	
	/**
	 * instantiate the IWindmillDAO
	 */
	@Autowired
	IWindmillDAO windmillDAO;
	

	/**
	 *Windmill registration
	 */
	@Override
	public WindmillDetails registerWindmill(WindmillDetails windmillDetails) {
		WindmillDetails windmillResponse = null;
		if(windmillDetails.getUniqueId().length()!=16) {
			throw new WindmillValidationException(WindmillConstants.INCORRECT_WINDMILL_ID,
					ErrorCodes.INCORRECT_WINDMILL_ID);
		}else {
			if(null != windmillDetails && null != windmillDetails.getUniqueId()){
		        
					 windmillResponse = windmillDAO.registerWindmill(windmillDetails);
		        }
		}
		return windmillResponse;
	

	}


	/**
	 * get the details for chart creation
	 */
	@Override
	public List<WindmillAvgDetails> getChartData(String uniqueId) {
		if(null != uniqueId) 
			return windmillDAO.getChartData(uniqueId);
		else
			throw new WindmillValidationException(WindmillConstants.WINDMILL_ID_NOT_NULL,
					ErrorCodes.WINDMILL_ID_NOT_NULL); 
		
		
		
	}

}
