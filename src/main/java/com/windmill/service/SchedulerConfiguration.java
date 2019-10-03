/**
 * 
 */
package com.windmill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.windmill.dao.IWindmillDAO;
import com.windmill.entity.WindmillEnergyDetails;

/**
 * @author JEYALAKSHMIV
 * Scheduler which will push the energy data to the server ever 5 min
 */
@Component    
@EnableScheduling
public class SchedulerConfiguration {
	@Autowired
	IWindmillDAO windmillDAO;

	private static int i = 0;
	
	/**
	 * Cron Scheduler which will push the energy data to the server ever 5 min
	 */
	@Scheduled(cron="*/5 * * * *")
	public void scheduleWindmillEnergy() {
		System.out.println("inside the scheduler");
		
		WindmillEnergyDetails energyDetails = new WindmillEnergyDetails();
		energyDetails.setUniqueId("1234567891234567");
		energyDetails.setEnergyProduced(i++);
		windmillDAO.saveEnergyDetails(energyDetails);
	}

}
