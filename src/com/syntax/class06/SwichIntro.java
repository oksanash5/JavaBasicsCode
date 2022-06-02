package com.syntax.class06;

public class SwichIntro {

	public static void main(String[] args) {
		int day=1;
		String name;

		if (day==1) {
			name="Monday";
		}else if(day==2) {
			name="Tuesday";
		}else if(day==3) {
			name="Wednesday";	
		}else if(day==4){
			name="Thursday";	
		}else if(day==5) {
			name="Friday";
		}else if(day==6) {
			name="Saturday";		
		}else if(day==7) {
			name="Sunday";
		}else {//always is a last block
			name="Invalid";
		}
		System.out.println(name);
		
		System.out.println("----------------------");
		//switch is a value based statement
		switch(day) {
		case 1:
			name="Monday";
		break;	
		case 2:
			name="Tueasday";
			break;
		case 3:		
		    name="Wednesday";
		    break;
		case 4:
			name="Thursday";
			break;		
		case 5:
			name="Friday";
			break;
		case 6:
			name="Satuday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
		//	break; //only if default is at the end of code we don't need break
		
		}
       System.out.println(name);
	}
}