package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		
		//  ^ - means not
		
     String str="sfkafdb18247t8725KSNDKASD!@#$((%^^";

    System.out.println(str.replaceAll("[0-9]", "#"));//sfkafdb#####t####KSNDKASD!@#$((%^^
    System.out.println(str.replaceAll("[a-z]", "#"));//#######18247#8725KSNDKASD!@#$((%^^
    System.out.println(str.replaceAll("[A-Z]", "#"));//sfkafdb18247t8725########!@#$((%^^
    System.out.println(str.replaceAll("[A-Za-z]", "#"));//#######18247#8725########!@#$((%^^
    System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));//#########################!@#$((%^^
    System.out.println(str.replaceAll("[^a-z]", "_"));//sfkafdb_____t_____________________
    System.out.println(str.replaceAll("[^A-Z]", "*"));//*****************KSNDKASD*********
    System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));//sfkafdb18247t8725KSNDKASD*********
	
    str="abcdefghijkl";
    System.out.println(str.replaceAll("[a-f]", "*"));//******ghijkl// range from a to f
   
    str="sfkafdb18247t8725KSNDKASD!@#$((%^^";
    System.out.println(str.replaceAll("[^A-za-z0-9]", ""));//remove the special character
    System.out.println(str.replaceAll("[^A-z]", ""));//sfkafdbtKSNDKAS
	}

}
