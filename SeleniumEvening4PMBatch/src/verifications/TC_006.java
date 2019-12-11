package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_005");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("amazonurl"));
		
		
		/*
		 * //String actualLink =
		 * driver.findElement(By.linkText("AmazonBasics")).getText(); String actualLink
		 * = driver.findElement(By.linkText("AmazonBasics")).getAttribute("innerHTML");
		 * String expectedLink="AmazonBas";
		 * 
		 * System.out.println("Actual Link :" + actualLink);
		 * System.out.println("Expected Link :" + expectedLink);
		 * 
		 * //if(actualLink.equals(expectedLink))
		 * //if(actualLink.equalsIgnoreCase(expectedLink))
		 * if(actualLink.contains(expectedLink))
		 * System.out.println("Bot links are equal...."); else
		 * System.out.println("Bot links are not equal....");
		 */
		
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("philips");
		
		String val = loc.getAttribute("value");
		
		System.out.println("Entered text is : - " + val);
		

		report.endTest(test);
		report.flush();

	}

}

