package com.icici.loans.carloans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionChild extends CheckedException
{

	
	public  void m1() throws FileNotFoundException
	{
		BufferedReader b=new BufferedReader(new FileReader("d://abc.txt"));
		System.out.println("overriden file");
	}

	public static void main(String[] args) 
	{
		CheckedExceptionChild c=new CheckedExceptionChild();
		

	}

}
