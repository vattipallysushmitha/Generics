/*
purpose = Refactor all the 3 to One Generic Method and find the maximum
		-Ensure the Generic Type extends Comparable Refactor 1
		-Make the test case work
* @author sushmitha
* @since-27-08-2022
*/

package com.bridzelab.Generics;

public class Refactor1
{
    //compareTo method for Checking Maximum among varibales
	public <T extends Comparable<T>> T compareTo(T a,T b,T c) 
	  {
	        if(a.compareTo(b) > 0)
	        {
	            if(a.compareTo(c) > 0) {
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
