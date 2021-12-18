package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> tr = Arrays.asList(new Integer[] {14,12,13,11,15,14,18,16,17,19,18,17,20});
		System.out.println("Duplicate numbers are:");
		Set<Integer> newtr =  new TreeSet<Integer>();
		boolean Success;
		for(Integer a:tr)
		{
			Success = newtr.add(a);
			if(Success == false)
				System.out.println(a);
		}
		
		System.out.println(newtr);
	}

}
