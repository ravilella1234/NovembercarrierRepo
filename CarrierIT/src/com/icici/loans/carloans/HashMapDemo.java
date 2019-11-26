package com.icici.loans.carloans;

import java.util.TreeMap;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h=new TreeMap<>();
		h.put(90, 100);
		h.put(20, 200);
		h.put(100, 300);
		h.put(40, 100);
		h.put(50, 100);
		
		System.out.println(h);
		System.out.println(h.get(20));

	}

}
