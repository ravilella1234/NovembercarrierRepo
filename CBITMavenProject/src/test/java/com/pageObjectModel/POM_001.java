package com.pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.BaseTest;

public class POM_001 extends BaseTest
{
  
	 LoginPage page;
	
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String btype) throws Exception 
  {
	  init();
	  launch(btype);
	  navigateUrl("automationpractice");
  }
  
  @Test
  public void f() 
  {
	  
	  page=new LoginPage(driver);
	  page.customerLogin();
	  String expectedText="Authentication failed.";
	  Assert.assertEquals(page.verifyLogin(), expectedText);
	  
	  
		/*
		 * driver.findElement(By.linkText("Sign in")).click();
		 * driver.findElement(By.id("email")).sendKeys("qatest975457@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("password");
		 * driver.findElement(By.id("SubmitLogin")).click(); String actualText =
		 * driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"
		 * )).getText(); String expectedText="Authentication failed.";
		 * Assert.assertEquals(actualText, expectedText);
		 */
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
