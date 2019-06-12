/**
 * Exercise 4 - Methods
 * Problem to practice Methods in Java
 * @author TSRaghu 
 * 
 */

package testcases;

import java.util.Scanner;

public class Exercise4 
 {
	//Problem 1 - Sum of two numbers
	//Getting user input using scanner class
	
	public static void sum()
	 {
		Scanner sc = new Scanner(System.in);
		 try
		  {
			int x,y;
			System.out.println("Enter a number: ");
			x = sc.nextInt();
			System.out.println("Enter another number: ");
			y=sc.nextInt();
			System.out.println("Sum is "+(x+y));
		  }
		
		finally
		  {
			sc.close();
	 	  }
	 }
	
	//Problem 2 - Define a method that returns the product of two numbers entered by user.
	
	public static void prod()
	 {
		Scanner pd = new Scanner(System.in);
	
		try
		  {
			int a,b;
			System.out.println("Enter a number: ");
			a = pd.nextInt();
			System.out.println("Enter another number: ");
		    b=pd.nextInt();
		    System.out.println("Product is "+(a*b));
	      }
		finally
		  {
			 pd.close();
		  }
	 }
	
	//Problem 3 - Calculate the circumference,area of circle
	//Circumference of circle - 2*3.14*radius
	//Area - 3.14*r*r
	//Needed input from user - Radius
	
	public static void circle()
	 {
	   Scanner ci = new Scanner(System.in);
	   
	   try
	    {  
		   int radius;
		   System.out.println("Enter radius: ");
		   radius = ci.nextInt();
		   System.out.println("Circumference is: "+(2*3.14*radius));
		   System.out.println("Area is:  "+(3.14*radius*radius));
	    }
	   finally
	   {
		   ci.close();
	   }
	 }
	
	//Main method to call sub methods
	public static void main(String args[]) throws InterruptedException
	{
		//Run the method to calculate sum
		System.out.println("Problem 1: Sum of two numbers");
		sum();
		
		Thread.sleep(2000);
	    System.out.println();
		
		//Run the method to calculate product
		System.out.println("Problem 2: Product of two numbers");
	    prod();
	    
	    Thread.sleep(1000);
	    System.out.println();
	    
	    //Run the method to calculate Circumference and Area of circle
	    //Run the method to calculate product
	  	System.out.println("Problem 3: Circle Properties");
	  	circle();
	    
	}
 }
