package com.marlabs;

public class StringCreation {

	public static void main(String[] args) {
		/* literal method */
		// just like initializing primitive variables
		// int a = 1;
		// char ch = 'a';
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1.equals(s2)); // compare the values of string objects
		System.out.println(s1 == s2); // compare the addresses of string objects
		System.out.println("=====");
		
		/* constructor method */
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		System.out.println("=====");

		// == and equals() are not overridden in StringBuilder
		StringBuilder sb1 = new StringBuilder("marlabs");
		StringBuilder sb2 = new StringBuilder("marlabs");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1 == sb2);
	}

}
