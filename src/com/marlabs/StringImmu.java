package com.marlabs;

public class StringImmu {

	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "welcome";
		s1 = s1.concat(" to Marlabs."); // concat() is important
		s2.concat("to Marlabs.");

		System.out.println("s1 is: " + s1);
		System.out.println("s2 is: " + s2);

		System.out.println(s1.toCharArray().length); // toCharArray()
		System.out.println(s1.getClass().getName()); // reflection mechanism
	}

}
