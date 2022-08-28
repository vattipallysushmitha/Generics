package com.bridzelab.Refactor2;

public class Refactor2Main
{

	public static void main(String[] args) 
	{
		
		//welcome  from  user to print the message
		System.out.println("**********************************************************");
		System.out.println("Welcome to JAVA Generics developed by Vattipally Sushmitha");
		System.out.println("**********************************************************");
        System.out.println("Welcome to Java Core - Generics Test Maximum Developed by Tahir Mansuri.");
        Refactor2 integerComparison = new Refactor2(9870,12650,8760);
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo());
        Refactor2 floatComparison = new Refactor2(432.76F,1760.543F,167.098F);
        System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo());
        Refactor2 stringComparison = new Refactor2("grapes","custedapple","orange");
        System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo());
    }

}
