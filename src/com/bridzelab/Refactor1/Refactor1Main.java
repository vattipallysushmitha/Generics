package com.bridzelab.Refactor1;

public class Refactor1Main
{
    //Creating main method to dispaly given messages
	public static void main(String[] args) 
    {
		//welcome  from  user to print the message
		System.out.println("**********************************************************");
		System.out.println("Welcome to JAVA Generics developed by Vattipally Sushmitha");
		System.out.println("**********************************************************");
        //Creating Generic Float Object for Float Comparison
    	Refactor1 integerComparison = new Refactor1();
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo(5460,18475,830));
        //Creating Generic Float Object for Float Comparison
        Refactor1 floatComparison = new Refactor1();
        System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo(876.0F,12.0F,6570.0F));
        //Creating Generic String Object for String Comparison
        Refactor1 stringComparison = new Refactor1();
        System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo("Apple","avacado","promagranate"));
    }

}
