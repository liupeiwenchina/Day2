package com.marlabs;

public class BinaryTest {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println("Mar" + "labs");

		// () should be applied properly for desired results
		System.out.println(1 + 2 + "Marlabs" + 3 + 4);
		System.out.println(1 + 2 + "Marlabs" + (3 + 4));
	}

}
