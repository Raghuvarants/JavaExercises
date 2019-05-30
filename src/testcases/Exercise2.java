/**
 *  @ Exercise - 2 - Assignment - Conditional Operators
 *  @author Raghu
 *  
 */

package testcases;

public class Exercise2 
{
	 public static void main(String args[])
	 {
		//Problem 1 - Get 4 numbers as input from user and print the greatest of those 4 numbers
		int n1 = 25;
		int n2 = 78;
		int n3 = 87;
		int n4 = 90;
		
		if (n1 > n2 && n1 > n3 && n1 > n4)
	  	   {
			 System.out.println("The greatest number is:" + n1);		
	       }
		else if (n2 > n1 && n2 > n3 && n2 > n4)
		   {
			 System.out.println("The greatest number is:" + n2);	
		   }
		else if (n3 > n1 && n3 > n2 && n3 > n4)
		   {
			 System.out.println("The greatest number is:" + n3);	
		   }
		else
		  {
			System.out.println("The greatest number is:" + n4);
		  }
	   
		//Problem 2 - Evaluate whether a number is positive or negative
		
		//Declare the numbers to be validated
		int n5 = 35;
		int n6 = -11;
		
		//Evaluate n5 is positive or negative		
		if (n5 > 0)
		{
			System.out.println("The number "+n5+" is Positive");
		}
		else
		{
			System.out.println("The number "+n5+" is negative");
		}
		
		//Evaluate n6 is positive or negative		
		if (n6 > 0)
		{
			System.out.println("The number "+n6+" is Positive");
		}
		else
		{
			System.out.println("The number "+n6+" is negative");
		}
	
		//Problem 3 - Print the capital of the countries
			
	 }
	}
