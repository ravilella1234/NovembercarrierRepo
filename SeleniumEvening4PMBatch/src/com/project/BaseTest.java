package com.project;

import java.io.FileInputStream;
import java.util.Properties;

import org.omg.IOP.ProfileIdHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	public  static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	
	
	public static void init() throws Exception
	{
		FileInputStream fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
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
		
	}

}
