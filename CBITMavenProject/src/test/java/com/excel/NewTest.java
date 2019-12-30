package com.excel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest 
{
	
  @Test(dataProvider = "dp")
  public void f(Object[][] data) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
	  Object[][] data=new Object[2][2];
	  data[0][0]="A";
	  data[0][1]="B";
	  data[1][0]="C";
	  data[1][1]="D";
	  
	return data;
   
  }
}
