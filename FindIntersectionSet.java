package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersectionSet {

	public static void main(String[] args) {

		List<Integer> tr1 = Arrays.asList(new Integer[] {3,2,11,4,6,7});
		List<Integer> tr2 = Arrays.asList(new Integer[] {1,2,8,4,9,7});
		Set<Integer> newtr1 = new LinkedHashSet<Integer>();
		Set<Integer> newtr2 = new LinkedHashSet<Integer>();
		newtr1.addAll(tr1);
		newtr2.addAll(tr2);
		Iterator itr1 = newtr1.iterator();
		Iterator itr2 = newtr2.iterator();

		while(itr1.hasNext()) {
			//System.out.println(itr1.next());
			if(itr1.next() == itr2.next())
				 
				System.out.println(itr1.);
			
		}
		//		for (Integer i = 1; i < Collections.max(newtr); i++) {
		//			
		//			if(i != itr1.next())
		//			{
		//				System.out.println(i);
		//			}

	}

}


