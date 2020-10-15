package org.tcs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if((text1.length())==(text2.length())) {
					char[] charArray = text1.toCharArray();
					char[] charArray2 = text2.toCharArray();
					Arrays.sort(charArray);
					Arrays.sort(charArray2);
					System.out.println(charArray);
					System.out.println(charArray2);
			if(charArray.equals(charArray2))
						System.out.println("equals value");
					else
						System.out.println("not equal value");
		
	}

}
}
