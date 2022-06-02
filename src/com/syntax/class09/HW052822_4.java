package com.syntax.class09;

public class HW052822_4 {

	public static void main(String[] args) {
		int[] elements= {10,26,17,8,15,64};
		int sum=0;
		for (int n=0; n<elements.length; n++) {
			sum+=elements[n];
			System.out.println(sum);
		}
		System.out.println("------------------");
        System.out.println("The sum of all elements is "+sum);
	}

}
