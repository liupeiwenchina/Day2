package com.marlabs;

public class StringDemo {

	public static void main(String[] args) {
		String str = "cricket";
		str.toUpperCase();
		System.out.println(str); // String is immutable

		String str2 = str.toUpperCase();
		System.out.println(str2); // the new variable name is necessary for the new string

		char ch = str.charAt(3); // index is 0 based
		System.out.println(ch);

		int x = str.indexOf('k');
		int y = str.lastIndexOf("c");
		System.out.println("k located at " + x + " and y located at " + y + " in " + str);

		int x2 = str2.indexOf('k'); // return -1 if not existing
		int y2 = str2.lastIndexOf("c");
		System.out.println("k located at " + x2 + " and y located at " + y2 + " in " + str2);

		String temp = new String("World Cup ").concat(str);
		System.out.println(temp);

		String data = temp.substring(0, 5); // substring() method is overloaded.
		System.out.println(data);

		String data2 = temp.substring(6);
		System.out.println(data2);
	}

}
