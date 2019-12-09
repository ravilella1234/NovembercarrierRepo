package com.project;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.omg.IOP.ProfileIdHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
	public static WebDriver driver;
	public  static String projectPath=System.getProperty("user.dir");
	static FileInputStream fis;
	public static Properties p,or;
	//public static Properties or;
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	public static void init() throws Exception
	{
		fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"//or.properties");
		or=new Properties();
		or.load(fis);
		
		PropertyConfigurator.configure(projectPath+"//log4j.properties");
		
		
		
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"//Drivers//chromedriver.exe");
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			
			option.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("lella");
			
			//notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(profile);
			
			System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers//geckodriver.exe");
			driver=new FirefoxDriver(option);
		}
		
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
		driver.manage().window().maximize();
	}
	
	
	public static void clickElement(String locatorKey) {
		getElement(locatorKey).click();
		//driver.findElement(By.xpath(or.getProperty(locatorKey))).click();
	}


	public static void typeText(String locatorKey, String textValue) {
		getElement(locatorKey).sendKeys(or.getProperty(textValue));
		//driver.findElement(By.name(or.getProperty(locatorKey))).sendKeys(or.getProperty(textValue));
	}

	public static void selectItem(String locatorKey, String item) {
		getElement(locatorKey).sendKeys(or.getProperty(item));
		//driver.findElement(By.id(or.getProperty(locatorKey))).sendKeys(or.getProperty(item));
	}
	
	public static WebElement getElement(String locatorKey) {
		
		WebElement element=null;
		
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element=driver.findElement(By.className(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext")) {
			element=driver.findElement(By.linkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			element=driver.findElement(By. partialLinkText(or.getProperty(locatorKey)));
		}
		
		return element;
		
	}


}
