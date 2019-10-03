/**
 * 
 */
package com.windmill.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.windmill.dao.WindmillDAOImpl;
import com.windmill.entity.WindmillDetails;

/**
 * @author JEYALAKSHMIV
 *
 */
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = { WindmillServiceImpl.class, WindmillDAOImpl.class })
public class WindmillServiceTest {

	@Autowired
	private IWindmillService windmillService;
	/**
	 * Validate the unique Id
	 */
	@Test
	public void testRegisterWindmill() {
		WindmillDetails windmillDetails = new WindmillDetails();
		windmillDetails.setUniqueId("12345678123452");
		windmillDetails.setName("windmill_1");
		windmillDetails.setLatitude("12.0");
		windmillDetails.setLongtitude("45.0");
		windmillDetails.setAddress("chennai");
		
		assertNotNull(windmillService.registerWindmill(windmillDetails));
	}

}
