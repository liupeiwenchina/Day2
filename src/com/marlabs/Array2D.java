//second commit
package com.marlabs;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {

		int rows = 5;
		int cols = 4;
		
		int[][] myArray1 = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(myArray1[i][j] + ", ");
			}
			System.out.println();
		}

		/*
		 * the default length of a multi-dimensional array is the length of the
		 * 1st dimension
		 */
		System.out.println(myArray1.length);

		int[][] myArray2 = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println(Arrays.deepToString(myArray2));
	}
	
}
