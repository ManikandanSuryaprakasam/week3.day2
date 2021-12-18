


//package week1.day2.assignments.mandatory;
//
//public class FindIntersection {
//
//	/*
//	 * Pseudo Code
//	
//	 * a) Declare An array for {3,2,11,4,6,7};	 
//	 * b) Declare another array for {1,2,8,4,9,7};
//	 * c) Declare for loop iterator from 0 to array length
//	 * d) Declare a nested for another array from 0 to array length
//	 * e) Compare Both the arrays using a condition statement
//	 
//	 *  f) Print the first array (shoud match item in both arrays)
//	 */
//	
//}

package week3.day2;

import java.util.List;
import java.util.ArrayList;
public class FindIntersectionList {
    public static void main(String args[]) {
      

      
    List<Integer> s1= new ArrayList<Integer>();
    List<Integer> s2= new ArrayList<Integer>();
    int a[] = {3,2,11,4,6,7};
    int b[] = {1,2,8,4,9,7};
    System.out.println("Intersection elements are :");
    
    for (int i = 0; i < b.length; i++) {
    	
    	s1.add(a[i]);
    	s2.add(b[i]);
    	
		
	}
    
    for(int element1:s1)
    {
    	for(int element2:s2)
    		
    	if (element1 ==element2 ) {
    		System.out.println(+element1);
    	   
    }}

    
}}