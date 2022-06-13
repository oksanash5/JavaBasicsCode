package com.syntax.class14;

public class HW060822_7 {
 
	String getGrade(int grade) {
		switch(grade) {
		case 90:
			return"A";
		case 80:
			return "B";
		case 70:
			return "C";
		case 60:
			return "D";
		case 50:
			return "E";
			default:
				return "F";			
		}
	}
public static void main(String[] args) {
	HW060822_7 student=new HW060822_7();
	System.out.println(student.getGrade(90));
	
	
}
}
