package com.icici.loans.carloans;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyClassDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>();
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		Enumeration<Integer> val = v.elements();
		while(val.hasMoreElements())
		{
			Integer var = val.nextElement();
			if(var%2==0)
				System.out.println(var);
		}
		System.out.println(v);
	}

}
