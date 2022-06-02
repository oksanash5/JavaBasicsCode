package com.syntax.class10;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] usa= {
				{"New York","Albany","Buffalo"},
				{"Los Angeles","San Fransisco","San Jose","San Diego","Redding"},
				{"Miami","Orlando","Niceville","Tampa"},
				{"McLean","Richmond","Leesburg"}
		};
	// outer loop iterates over row
		// inner loops i
		for(int row=0; row<usa.length; row++) {
			for (int cols=0;cols<usa[row].length;cols++) {
				System.out.println(usa[row][cols]);
			}
		System.out.println("-----------------");
		}
		
		
		for (String[]state:usa) {
			for (String city:state) {
				System.out.println(city+" ");
			}
		System.out.println();
		}
	}
	

}
