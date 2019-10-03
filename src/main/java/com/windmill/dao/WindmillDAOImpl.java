/**
 * 
 */
package com.windmill.dao;

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
 *Implementation of the DAO class
 */
@Repository
@Transactional
public class WindmillDAOImpl implements IWindmillDAO {

	/**
	 * instantiate the Entitymanager
	 */
	@PersistenceContext
	private EntityManager entity;

	/**
	 * Windmill registeration 
	 */
	@Override
	public WindmillDetails registerWindmill(WindmillDetails windmillDetails) {
		Query query = entity.createQuery(SQLConstants.CHECK_WINDMILL_ID_AVAILABLE);
		query.setParameter(WindmillConstants.UNIQUE_ID, windmillDetails.getUniqueId());
		if (query.getResultList().isEmpty()) {
			entity.persist(windmillDetails);

		} else {
			throw new WindmillValidationException(WindmillConstants.WINDMILL_ID_PRESENT,
					ErrorCodes.WINDMILL_ID_PRESENT_ERROR_CODE);
		}
		return windmillDetails;

	}

	/**
	 * Save the Wind mill ennergy details every 5 mins which is pushed by scheduler
	 */
	@Override
	public void saveEnergyDetails(WindmillEnergyDetails energyDetails) {
		if (null != energyDetails) {
			entity.persist(energyDetails);
		}
	}

	/**
	 * To calculate and map the chart creation date
	 */
	@Override
	public List<WindmillAvgDetails> getChartData(String uniqueId) {
		Query query = entity.createQuery(SQLConstants.GET_WINDMILL_CHART_DETAILS);
		query.setParameter(WindmillConstants.UNIQUE_ID, uniqueId);
		return query.getResultList();

	}

}
