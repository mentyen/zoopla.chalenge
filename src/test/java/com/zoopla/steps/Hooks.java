package com.zoopla.steps;



import com.zoopla.utils.BaseClass;
import com.zoopla.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	@Before
	public void start(Scenario scenario) {
		BaseClass.setUp();
		System.out.println(scenario.getName()+ ": START");
		
	}
	
	
	@After
	public void stop(Scenario scenario) {
		
		System.out.println(scenario.getName()+": FINISHED");
		if(scenario.isFailed()) {
			byte[]pic=CommonMethods.takeScreenshot();
			scenario.embed(pic, "png");
			
		}
		
		BaseClass.tearDown();
		
	}

}
