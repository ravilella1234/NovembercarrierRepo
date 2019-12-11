package verifications;

import com.project.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends  BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_006");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("amazonurl"));

		
	
		String expectedLink="amazonBas";
		
		if(!verifyElement(expectedLink))
			reportFailure("Both Links are not equal....");
		else
			reportSuccess("Both Links are equal....");
		
		report.endTest(test);
		report.flush();
		
	}

	

}
