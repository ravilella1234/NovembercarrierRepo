package com.excel;

public class ExcelOperations 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1=new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		
		System.out.println(e1.getRowCount("Login"));
		
		System.out.println(e1.columnCount("Login"));
		
		System.out.println(e1.getCellData("Login", 0, 3));
		
		System.out.println(e1.getCellData("Login", "Password", 2));
		
		e1.setCellData("Login", 4, 3, "Passed");

	}

}
