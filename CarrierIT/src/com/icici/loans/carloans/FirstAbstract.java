package com.icici.loans.carloans;

public abstract class FirstAbstract
{
	int a=10;
	
	public void m1()
	{
		System.out.println("iam m1 from FirstAbstract Class...");
	}
	
	public abstract void m2();

	public static void main(String[] args) 
	{
		//FirstAbstract obj=new FirstAbstract();
		
		FirstAbstract f=new ChildClass();
		f.m1();
		f.m2();
		System.out.println(f.a);

	}

}
