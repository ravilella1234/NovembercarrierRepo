package com.project.CBITMavenProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class LinksTesting1 extends BaseTest
{

	
	@BeforeMethod(groups = {"regression","sanity"})
	@Parameters("browser")
	public void setup(String browserType) throws Exception
	{
		test=report.startTest("LinksTesting1");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch(browserType);
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("googleurl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("googleurl"));
	}
	
	
	@Test(groups = {"regression","sanity"})
	public void linktesting1()
	 {
		String expval="Google Images";
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
	 }
	
	@AfterMethod(groups = {"regression","sanity"})
	public void tearDown()
	{
		driver.quit();
	}

}
