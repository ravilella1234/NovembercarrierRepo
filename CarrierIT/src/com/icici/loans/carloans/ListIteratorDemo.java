package com.icici.loans.carloans;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("mindq");
		a.add("oracle");
		a.add("durgasoft");
		a.add("oaktech");
		a.add("stansys");
		
		System.out.println(a);
		
			
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String v = val.next();
			if(v.equals("stansys"))
				val.set("carrier");	
			else
				val.remove();
		}
		System.out.println(a);
	}

}
