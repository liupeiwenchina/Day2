package com.marlabs;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {

		/* declaration */
		int[] myArray1; // preferred
		int myArray2[]; // not preferred
		// System.out.println(myArray5); // cannot be printed without initialization

		/* initialization */
		// int[5] myArray3; // invalid in Java
		// int[] myArray4 = new int[]; // dimension must be specified
		int[] myArray5 = new int[5]; // what are the default values?

		// method 1: for loop
		for (int i = 0; i < myArray5.length; i++) {
			System.out.print(myArray5[i] + ", ");
		}
		System.out.println();
		
		// method 2: advanced for loop
		for (int myarray5 : myArray5) {
			System.out.print(myarray5 + ", ");
		}
		System.out.println();

		// print the elements in an array
		// the toString() method has not been overridden yet
		System.out.println(myArray5.toString()); // array + array initial + address
		System.out.println(Arrays.toString(myArray5));
		
		// array is mutable
		myArray5[0] = 1;
		System.out.println(Arrays.toString(myArray5));

		// there is no Tuple in Java
		// int[] myArray6 = { 1, 2, 3.0 }; //type mismatch

		int[] myArray7 = { 1, 2, 3 };
		System.out.println(Arrays.toString(myArray7));
		System.out.println(myArray7.length);
	}

}
