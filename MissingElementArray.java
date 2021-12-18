package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;



public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> tr = Arrays.asList(new Integer[] {1,2,3,4,7,6,8});
		Integer max = Collections.max(tr);
		System.out.println(max);
		System.out.println("Missing Elements are:");
		
for(int i = 1;i <max ;i++)
{

	if(!(tr.contains(i)))
	System.out.println(i);	
      }
		
		

	}

}
