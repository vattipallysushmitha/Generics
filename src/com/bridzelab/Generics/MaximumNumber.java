package com.bridzelab.Generics;
/**
 * Purpose- to find maximum float value
 * @author sushmitha
 * @since-27-08-2022
 */

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
	
    //compareTo method for Checking Maximum from 3 Float Object
	public static Float compareTo(Float d,Float e,Float f) 
	 {
	        if(d > e)
	        {
	            if(d > f)
	            {
	                return d;
	            } 
	            else 
	            {
	                return f;
	            }
	        } 
	        else 
	        {
	            if(e > f)
	            {
	                return e;
	            }
	            else
	            {
	                return f;
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
		System.out.println("Maximum from 3 Float Object is : "+compareTo(56.2f,38.5f,29.0f));

	}

}
