package com.qaminds.testget_apptive;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;


import com.qaminds.coreappium.MyDriverAppium;

public class BaseTest {
	Logger Log =Logger.getLogger(BaseTest.class);
	
	MyDriverAppium myDriver = new MyDriverAppium();
	private ResourceBundle resource = ResourceBundle.getBundle("propertiesConfig");
	
	@BeforeSuite
	public void chargeDriver() {
		
		try {
			myDriver.setUpAppiumDriver();
		}catch (Exception e) {
			Log.error("There is error in BaseTest.chargerDriver", e);
		}
	}
	public void finishDriver() {
		if (myDriver != null) {
			myDriver.closeApp();
		}
	}
	
	public String getProperty(String key) {
		return resource.getString(key);
	}

}