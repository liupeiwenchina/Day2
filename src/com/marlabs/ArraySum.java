package com.marlabs;

public class ArraySum {

	public static void main(String[] args) {
		String[] myArray1 = { "10", "20", "30" };
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < myArray1.length; i++) {
			sum1 += Integer.valueOf(myArray1[i]);
			sum2 += Integer.parseInt(myArray1[i]);
		}

		System.out.println(sum1);
		System.out.println(sum2);
	}

}
