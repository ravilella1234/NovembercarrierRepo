package com.excel;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC_004 extends BaseTest
{
	
	@Test(dataProvider = "dp")
	public void m1(Hashtable<String, String> data)
	{
		System.out.println("Iam test Method.....");	
	}
	
	@DataProvider
	public Object[][] dp()
	{
		System.out.println("Iam Dataprovider.......");
		
		return DataUtils.getTestData(xls, "Data", "TestA");
		
	}

}
