package com.icici.loans.homeloans;

import java.util.Scanner;

public class SampleClass 
{

	public static void main(String[] args)
	{
		/*int[] a= {10,20,30,40};
		
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]=");
			System.out.println(a[i]);
		}*/
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int asize = sc.nextInt();
		
		int[] a=new int[asize];
		int sum=0;
		
		System.out.println("Enter the array Elements : - ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of the array is :- "+ sum);*/
		
		
		int[][] a=new int[2][2];	
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		
	}

}
