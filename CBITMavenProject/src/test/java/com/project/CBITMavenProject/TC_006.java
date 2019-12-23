package com.project.CBITMavenProject;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC_006 extends BaseTest
{
  
  @BeforeMethod(groups = {"regression"})
  @Parameters("browser")
  public void beforeMethod(String browserType) throws Exception 
  {
	  	test=report.startTest("TC_006");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch(browserType);
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("amazonurl"));
  }
  
  
  @Test(groups = {"regression"})
  public void amazon()
  {
	  	selectItem("amazondropbox_id","amazondropvalue");
		test.log(LogStatus.PASS, "Selected the item :- " + or.getProperty("amazondropvalue") + " By using the locator :- " + or.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","amazontextvalue");
		test.log(LogStatus.PASS, "Entered the text :- " + or.getProperty("amazontextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_id"));
	
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on button by using locator :- "+ or.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression"})
  public void afterMethod() 
  {
	  driver.quit();
	  
	  report.endTest(test);
	  report.flush();
	  
  }

}
