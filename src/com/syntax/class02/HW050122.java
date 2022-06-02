package com.syntax.class02;

public class HW050122 {

	public static void main(String[] args) {
		
		// Part 1
				double num1=20.2;
				double num2=10.4;
						double sum, sub, mult, div;
				        sum=num1+num2;
				        sub=num1-num2;
				        mult=num1*num2;
				        div=num1/num2;
	
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is egual to "+sum);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is egual to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
        System.out.println("The division of 2 numbers "+num1+" and "+num2+" is equal to "+div);
        
         //Part 2
        
        double val=3.9;
        System.out.println("the square of the "+val+" is "+val*val);
        		
         //Part 3
        int width=5;
        int height=8;
        int perim, area;
            perim=2*(width+height);
            area=width*height;
            
        System.out.println("The perimeter of a rectangle with width "+width+" and height "+height
        +" is equal to "+perim+" and the area is "+area+".");
        
        
	}

}
