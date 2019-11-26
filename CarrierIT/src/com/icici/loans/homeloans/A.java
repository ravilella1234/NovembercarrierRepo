package com.icici.loans.homeloans;

import java.util.Date;

public abstract class A 
{
	public static final int x=100;

	public void m1()
	{
		System.out.println("iam  m1 from class A");
	}
	
	public static void m4()
	{
		System.out.println("iam m4 static from class A");
	}
	
	static
	{
		Date dt=new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		A.m4();
	}
}
