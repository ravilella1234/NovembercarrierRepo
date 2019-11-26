package com.icici.loans.carloans;

public class DemoClass 
{
	int i=100;
	
	int a=10; // instance (or) non-static (or) global variable
	static String cname="vmware";  // static (or) global variable	
	static DemoClass obj;
	
	public void m1()
	{
		int a=20;  // local variable
		System.out.println(a);
		System.out.println(DemoClass.cname);
	}
	
	
	public static void m2()
	{
		obj=new DemoClass();
		System.out.println(obj.a);
		System.out.println(cname);
		
	}
	
	public static void main(String[] args) 
	{
		obj=new DemoClass();
		System.out.println(obj.a);
		System.out.println(DemoClass.cname);
	}

}
