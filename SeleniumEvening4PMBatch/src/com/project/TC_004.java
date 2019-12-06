package com.project;

import org.apache.log4j.Logger;

public class TC_004 extends  BaseTest
{
	private static Logger log=Logger.getLogger(TC_004.class);

	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("initializing the properties files.....");
		
		launch("chromebrowser");
		log.info("Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to Url :- " + p.getProperty("amazonurl"));
		
		selectItem("amazondropbox_id","amazondropvalue");
		log.info("Selected the item :- " + or.getProperty("amazondropvalue") + " By using the locator :- " + or.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","amazontextvalue");
		log.info("Entered the text :- " + or.getProperty("amazontextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_id"));
		
	
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on button by using locator :- "+ or.getProperty("amazonsearchbutton_xpath"));
	
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}

	
}
