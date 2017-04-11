package com.marlabs;

import java.util.ArrayList;

public class ArrayListToString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("welcome");
		list.add("to");
		list.add("marlabs");
		System.out.println(list);

		// intermediate String objects have been produced
		String listString = "";
		for (String s : list) {
			listString += s + " ";
		}
		System.out.println(listString);

		// no intermediate Sting objects need to be GC
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s + " ");
		}
		System.out.println(sb);
	}

}
