package com.icici.loans.carloans;

import java.util.Scanner;

public class ExceptionDemo 
{
	
	
	public static void main(String[] args) 
	{
		int nr,dr,result;
			
		Scanner sc=new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Enter the numarator value : ");
			nr=sc.nextInt();
			
			System.out.println("Enter the denominator value : ");
			dr=sc.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			finally {
				System.out.println("iam final message....");
			}
			 
			
		}

	}

}
