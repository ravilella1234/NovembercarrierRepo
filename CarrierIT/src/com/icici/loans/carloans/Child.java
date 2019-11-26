package com.icici.loans.carloans;


class Parent
{
	public  Number workHard()
	{
		System.out.println("wakeup early, gotocollege..");
		return 0;
	}
	
	void care()
	{
		System.out.println("atmost care....");
	}
}

public class Child extends Parent
{
	public strictfp Object workHard()
	{
		System.out.println("wakeup anytime, goto bar..");
		return 0;
	}
	
	void love()
	{
		System.out.println("iam in love...");
	}
	
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.workHard();
		c.care();
		c.love();
	}

}
