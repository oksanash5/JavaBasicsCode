package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char choice='y';
		String meaning;
		 switch(choice) {
		 //variable and matching cases MUST BE of the same type  'Y'/char
		 //switch does not allow to have duplicated cases
		 case'Y':
			 meaning="Yes";
			 break;
		 case'M' :
			 meaning="Maybe";
			break;
		 case'N':
			 meaning="No";
			 break;
			 default:
				 meaning="Unknow";
		 }
           System.out.println(meaning);
	}

}
