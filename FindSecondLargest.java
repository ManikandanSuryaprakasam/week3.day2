package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};

		Set<Integer> Slargest = new LinkedHashSet<Integer>();
		for(int num:data)
		{
			Slargest.add(num);
		}
		TreeSet<Integer> sorted = new TreeSet<Integer>(Slargest);
		sorted.remove(sorted.last());
		System.out.println(sorted.last());



	}

}
