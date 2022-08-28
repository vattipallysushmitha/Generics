/*
Refactor to create Generic Class to take in 3 variables of Generic Type
- Ensure the Generic Type extends Comparable
- Write parameter constructor
- Write testMaximum method to internally call the static testMaximum method passing the 3 instance variables
- Define new test case to use the Generic Class
* @author sushmitha
* @since-28-08-2022
*/


package com.bridzelab.Refactor2;

public class Refactor2 <T extends Comparable<T>>
{

	    T a,b,c;
	    //Generic Constructor for Handling Different Type Object
	    Refactor2(T a, T b, T c)
	    {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    //compareTo method for Checking Maximum from 3 Integer Object
	    public T compareTo()
	    {
	        if(a.compareTo(b) > 0)
	        {
	            if(a.compareTo(c) > 0)
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
	            if(b.compareTo(c) > 0)
	            {
	                return b;
	            }
	            else 
	            {
	                return c;
	            }
	        }
	    }

	    
	}

