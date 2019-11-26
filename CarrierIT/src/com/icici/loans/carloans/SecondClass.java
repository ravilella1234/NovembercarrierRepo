package com.icici.loans.carloans;

public class SecondClass 
{
	int a=10,b=20,c;  //properties
	
	public void add()  // behaviours
	{
		c=a+b;
		System.out.println("Addition of A & B is :" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A & B is : " + c);
	}
	

	public static void main(String[] args) {
		System.out.println("Hello");
		
		SecondClass obj=new SecondClass();
		//obj.add();
		//obj.sub();
		System.out.println(obj.c);
		
		SecondClass obj1=new SecondClass();
		obj1.add();
		obj1.sub();
	
	}
}
