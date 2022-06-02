package com.syntax.class09;

public class HW052822_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] cars= {"Acura","Audi","Mersedes","BMW","Toyota","Lexus"};
     
     for( String car :cars) {
    	 System.out.print(car+" ");
     }
	System.out.println("------------------");
	
	
	String[]bestCars=new String[6];
	bestCars[0]="Lexus";
	bestCars[1]="Mersedes";
	bestCars[2]="BMW";
	bestCars[3]="Toyota";
	bestCars[4]="Acura";
    bestCars[5]="Audi";
			
	
	for(int c=0; c<bestCars.length; c++) {
		System.out.print(bestCars[c]+" ");
	}
	}

}
