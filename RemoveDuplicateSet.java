package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "PayPal India";
		char[] chrPaypal = input.toCharArray();
		Set<Character> CharSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		boolean temp;
		
		for(char eachvalue:chrPaypal)
		{
		
			temp = CharSet.add(eachvalue);
			
			if (temp==false)
				dupCharSet.add(eachvalue);
		}
		
		for(char newvalue:CharSet)
		{
			if(Character.isWhitespace(newvalue))
			{
				continue;
			
		}
			else
				System.out.print(newvalue);
		
		
	}
}}


//package week3.day2.classroom;

//Input: "PayPal India"
//Output:PaylIndi

//public class RemoveDuplicates {
//
//	public static void main(String[] args) {		
//		
////		Declare a String as PayPal India
//
////		Convert it into a character array
//
////		Declare a Set as charSet for Character
//
////		Declare a Set as dupCharSet for duplicate Character
//
////		Iterate character array and add it into charSet
//
////		if the character is already in the charSet then, add it to the dupCharSet
//
////		Check the dupCharSet elements and remove those in the charSet
//
////		Iterate using charSet
//
////		Check the iterator variable isn't equals to an empty space
//
////		print each character for charSet
//
//	}
//
//}

