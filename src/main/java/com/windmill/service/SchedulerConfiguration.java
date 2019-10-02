/**
 * 
 */
package com.windmill.service;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.windmill.dao.IWindmillDAO;
import com.windmill.entity.WindmillEnergyDetails;

/**
 * @author JEYALAKSHMIV
 *
 */
@Component    
@EnableScheduling
public class SchedulerConfiguration {
	@Autowired
	IWindmillDAO windmillDAO;

	private static int i = 0;
	 @EventListener(ApplicationReadyEvent.class)
	//@Scheduled(fixedRate = 5000)
	public void scheduleWindmillEnergy() {
		System.out.println("inside the scheduler");
		
		WindmillEnergyDetails energyDetails = new WindmillEnergyDetails();
		energyDetails.setUniqueId("23353453");
		energyDetails.setEnergy_produced(i++);
		windmillDAO.saveEnergyDetails(energyDetails);
	}

}
