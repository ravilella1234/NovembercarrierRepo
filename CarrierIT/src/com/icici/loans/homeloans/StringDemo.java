package com.icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1="ravi kanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(4, 7));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		System.out.println(s1.replaceAll("ravi kanth", "avikanth"));
		System.out.println(s1.endsWith("avi"));
		System.out.println(s1.isEmpty());
		String[] s3 = s1.split(" ");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		
		
		String s2=new String("ravikanth");
		//System.out.println(s2);
		//System.out.println(s2.hashCode());
		
		System.out.println(s1.trim().equals(s2));
		
		//System.out.println(s1.concat(s2));
		//System.out.println(s1+s2);

	}

}
