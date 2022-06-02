package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		int[][] nums= {
				{1,2,3,4,5},
				{199,300,588,700},
				{1900,4578,98787}
		};
/*
 * i loop iterates over rows
 * nums.length gives #of array inside 2D array =3
 * 
 * 
 */
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+ " ");
			}
		System.out.println();
		}
		System.out.println("all value using  for loop");
		
		
		System.out.println("----------------");
		
		System.out.println("all value using enhanced for loop");
		/*
		 * enhanced for loop uses variables to access element from an array
		 * outer for loops -> iterates over 1D array
		 * inner loop -> iterates over elements of each 1D
		 */
		
		for (int[]num:nums) {
			for (int n:num) {
				System.out.print(n+" ");
			}
		System.out.println();
		}
	}

}
