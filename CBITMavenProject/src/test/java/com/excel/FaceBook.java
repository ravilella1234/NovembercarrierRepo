package com.excel;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class FaceBook extends BaseTest
{
	ExcelAPI e;
	
	@BeforeTest
	@Parameters("browser")
	public void startProcess(String bType) throws Exception 
	{
		test=report.startTest("FaceBook");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch(bType);
		test.log(LogStatus.PASS, "Laucned the browser :- " + bType);
		
		navigateUrl("fburl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("fburl"));
		
		e=new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata.xlsx");

	}
	
	@Test
	public void fb() throws Exception
	{
		for(int i=1;i<e.getRowCount("login");i++)
		{
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(e.getCellData("login", "UserName", i));
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(e.getCellData("login", "Password", i));
			
			Thread.sleep(3000);
		}
		
	}

}
