package com.icici.loans.carloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException 
{

	public  void m1() throws FileNotFoundException
	{
		BufferedReader b=new BufferedReader(new FileReader("d://abc.txt"));
	}
	
	public static void main(String[] args) throws Exception 
	{
		

	}

}
