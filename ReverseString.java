package org.tcs;

public class ReverseString {
	public static void main(String[] args) {
		String test="feeling good";
		int length = test.length();
		for(int i=length-1;i>=0;i--)
			System.out.print(test.charAt(i));
		
		System.out.println();
		
		char[] charArray = test.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
    }
}

