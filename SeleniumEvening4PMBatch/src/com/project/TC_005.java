package com.project;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005 extends  BaseTest
{
	private static Logger log=Logger.getLogger(TC_005.class);

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_005");
		
		init();
		log.info("initializing the properties files.....");
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch("chromebrowser");
		log.info("Laucned the browser :- " + p.getProperty("chromebrowser"));
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to Url :- " + p.getProperty("amazonurl"));
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("amazonurl"));
		
		selectItem("amazondropbox_id","amazondropvalue");
		log.info("Selected the item :- " + or.getProperty("amazondropvalue") + " By using the locator :- " + or.getProperty("amazondropbox_id"));
		test.log(LogStatus.PASS, "Selected the item :- " + or.getProperty("amazondropvalue") + " By using the locator :- " + or.getProperty("amazondropbox_id"));
		
		
		typeText("amazonsearchtext_id","amazontextvalue");
		log.info("Entered the text :- " + or.getProperty("amazontextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_id"));
		test.log(LogStatus.PASS, "Entered the text :- " + or.getProperty("amazontextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_id"));
	
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on button by using locator :- "+ or.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.PASS, "Clicked on button by using locator :- "+ or.getProperty("amazonsearchbutton_xpath"));
	
		
		report.endTest(test);
		report.flush();
	}

	
}
