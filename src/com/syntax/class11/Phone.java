package com.syntax.class11;

public class Phone {
   String model;
   String color;
   Double screenSize;  
   int storage;
   int price;
   
   void calls() {
	   System.out.println("Phone is able to calls and receive a the calls  ");
   }
   void sms() {
	   System.out.println("Phone sends and receives the messages");
   }
  void photo() {
	  System.out.println("Phone takes and saves the pictures");
  }
  void internet() {
	  System.out.println("Phone is able to connect to internet");
  }
     public static void main(String[] args) {   	 
	Phone iPhone=new Phone();
	iPhone.model="iPhone 13 Pro Max";
	iPhone.color="Silver";
	iPhone.screenSize=6.7;
	iPhone.storage=512;
	iPhone.price=1399;	
	System.out.println(iPhone.model);
	iPhone.calls();
	iPhone.sms();
	iPhone.photo();
	iPhone.internet();
	
	System.out.println("----------------");
		
	Phone Pixel=new Phone();
	Pixel.model="Google Pixel 6 Pro";
	Pixel.color="Black";
	Pixel.screenSize=6.7;
	Pixel.storage=512;
	Pixel.price=1099;
	System.out.println(Pixel.model);	
	System.out.println("---------------");
	
	Phone Samsung=new Phone();
    Samsung.model="Galaxy S22 Ultra";
    Samsung.color="Graphite";
    Samsung.screenSize=6.8;
    Samsung.storage=512;
    Samsung.price=1144;
    System.out.println(Samsung.model);
    		
}
}
