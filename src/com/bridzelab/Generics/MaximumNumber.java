/**
 * Purpose- to find maximum integer value
 * @author sushmitha
 * @since-27-08-2022
 */

package com.bridzelab.Generics;

public class MaximumNumber
{
	
    //compareTo method for Checking Maximum from 3 Integer Object
	public static Integer compareTo(Integer a,Integer b,Integer c) 
	 {
	        if(a > b)
	        {
	            if(a > c)
	            {
	                return a;
	            } 
	            else 
	            {
	                return c;
	            }
	        } 
	        else 
	        {
	            if(b > c)
	            {
	                return b;
	            }
	            else
	            {
	                return c;
	            }
	        }
	    }
	public static void main(String[] args)
	{
		//welcome from user
		System.out.println("************************");
		System.out.println("Welcome to JAVA Generics");
		System.out.println("************************");
		System.out.println("Maximum from 3 Integer Object is : "+compareTo(876,120,290));

	}

}
