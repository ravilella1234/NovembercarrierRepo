package com.icici.loans.homeloans;

public class B extends A
{
	public void m1()
	{
		System.out.println("iam overriden  m1 from class B");
	}
	
	public void m2()
	{
		System.out.println("iam  m2 from class B");
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		
		B b=new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
	}

}
