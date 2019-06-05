/**
 * Exercise 3 - Array List
 * Problem to practice Array/Array List in Java
 * @author TSRaghu 
 * 
 */

package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise3 
  {
	public static void main(String args[])
	 {
	   //Problem 1 - Create an ArrayList and add colors as input and print out the entire ArrayList
		
	   String a1[] = {"Red" , "Blue" , "Green", "Yellow"};
	   System.out.println(Arrays.toString(a1));
	   
	   //Problem 2 - Insert an element in first and last position in array list and print the array list
	   
	   ArrayList<String> a2 = new ArrayList<String>();
	   a2.add("Orange");
	   a2.add("Red");
	   a2.add("Blue");
	   
	   System.out.println(a2);
	   
	   //Problem 3 - Retrieve an element from Array list
	   System.out.println(a2.get(1));
	   
	   //Problem 4 - Update specific element in array list
	   a2.set(2, "white");
	   System.out.println(a2);
	   
	   //Problem 5 - Remove third element from the array list
	   a2.remove(2);
	   System.out.println(a2);
	   
	   //Problem 6 - Search an element in array list
	   //To check whether a specific element is present exists in the ArrayList , use boolean contains method
	    	   
	   boolean bln = a2.contains("Red");
	   System.out.println("Does A2 contains white ? " + " " + bln);
	   
	   //Problem 7 - Reverse element in ArrayList
	   //Though other methods exists to reverse an ArrayList , we used collections here since that's more efficient.
	   
	   Collections.reverse(a2);
	   System.out.println(a2);

	   //Problem 8 - Print few elements of the ArrayList
	   List<String> sub_List = a2.subList(0,1);
	   System.out.println(sub_List);
	   
	   //Problem 9 - Swap two elements in Array
	   Collections.swap(a2, 1, 0);
	   System.out.println(a2);
	   
	   //Problem 10 - Empty an Array List
	   a2.clear();
	   System.out.println(a2);
	   
	   //Problem 11 - Trim Virtual Capacity of Array List
	   a2.trimToSize();
	   System.out.println(a2);
	      
	   }
  }
