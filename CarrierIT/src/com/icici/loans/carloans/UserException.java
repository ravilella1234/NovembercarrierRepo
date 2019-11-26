package com.icici.loans.carloans;

import java.util.Scanner;

public class UserException extends Exception
{

	public UserException(String msg) 
	{
		//super(msg);
		//System.out.println(msg);
	}

	public static void main(String[] args) 
	{
		String num;
		
		Scanner sc=new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the String");
			num=sc.nextLine();
			if (num.length() != 10) {
				try {
					throw new UserException("String should be 10 characters.....");
				} catch (UserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println(num);
				break;
			} 
		}

	}

}
