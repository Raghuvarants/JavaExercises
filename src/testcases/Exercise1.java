/**
 *  @ Exercise - 1 - Assignment - Data Types
 *  @author Raghu
 *  
 */

package testcases;

public class Exercise1 
{
  public static void main(String args[])
  {
	  //Problem 1 - Print text in new line
	  System.out.println("Problem 1 Result: ");
	  System.out.println("Hello");
	  System.out.println("Programmer");
	  
	  
	  //Problem 2 - Sum of two numbers
	  int number1 = 74;
	  int number2 = 36;
	  System.out.println("Problem 2 Result: ");
	  System.out.println(number1 + number2);
	  
	  //Problem 3 - divide two numbers and print output
	  int number3 = 50;
	  int number4 = 3;
	  int number5 = (number3/number4);
	  System.out.println(number5);
	  
	  //Problem 4 - Multiple operators
	  //Problem a
	  int operat = -5+8*6;
	  System.out.println(operat);
	  
	  //Problem b
	  int multi = ((55+9) %9);
	  System.out.println(multi);
	  
	  //Problem c
	  int simplifycalc = ((20 + ((-3*5) /8)));
	  System.out.println(simplifycalc);
	  
	  //Problem d
	  int negatnumbers = ((5+ (15/3) * 2 - 8%3));
	  System.out.println(negatnumbers);
	  
	  //Problem e
	  double compnumber1 = ((25.5 * 3.5)-(3.5*3.5));
	  double comptnumber2 = (40.5-4.5);
	  System.out.println(compnumber1 / comptnumber2);
  }
 }
