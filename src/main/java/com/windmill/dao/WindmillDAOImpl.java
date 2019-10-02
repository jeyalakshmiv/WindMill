/**
 * 
 */
package com.windmill.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.windmill.constants.ErrorCodes;
import com.windmill.constants.SQLConstants;
import com.windmill.constants.WindmillConstants;
import com.windmill.entity.WindmillAvgDetails;
import com.windmill.entity.WindmillDetails;
import com.windmill.entity.WindmillEnergyDetails;
import com.windmill.exception.WindmillValidationException;

/**
 * @author JEYALAKSHMIV
 *
 */
@Repository
@Transactional
public class WindmillDAOImpl implements IWindmillDAO {
	
	@PersistenceContext
	private EntityManager entity;

	@Override
	public WindmillDetails registerWindmill(WindmillDetails windmillDetails) {
		Query query = entity.createQuery(SQLConstants.CHECK_WINDMILL_ID_AVAILABLE); 
		query.setParameter(WindmillConstants.UNIQUE_ID, windmillDetails.getUniqueId());
		if(query.getResultList().isEmpty()) {
			entity.persist(windmillDetails);
			
		}
		else {
			throw new WindmillValidationException(WindmillConstants.WINDMILL_ID_PRESENT,
					ErrorCodes.WINDMILL_ID_PRESENT_ERROR_CODE);
		}
		return windmillDetails;
			
		
	}

	@Override
	public void saveEnergyDetails(WindmillEnergyDetails energyDetails) {
		if(null != energyDetails) {
			entity.persist(energyDetails);
		}
	}
	@Override
	public List<WindmillAvgDetails> getChartData(String uniqueId){
		/*
		 * Query query = entity.createQuery(SQLConstants.GET_WINDMILL_CHART_DETAILS);
		 * query.setParameter(WindmillConstants.UNIQUE_ID,uniqueId); return
		 * query.getResultList();
		 */
		List<WindmillAvgDetails> windList = new ArrayList<WindmillAvgDetails>();
		WindmillAvgDetails avg1 = new WindmillAvgDetails();
		avg1.setAvg(12.1);
		avg1.setMax(78);
		avg1.setMin(34);
		avg1.setSum(120);
		windList.add(avg1);
		return windList;
	}

}
