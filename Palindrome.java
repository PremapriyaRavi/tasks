package org.tcs;

public class Palindrome {
	public static void main(String[] args) {
		String s1="madam";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		
			s2=s2+s1.charAt(i);

		if(s1.equalsIgnoreCase(s2))
			System.out.println("Given string is palindrome="+s1);
		else
			System.out.println("Given string is not palindrome="+s1);
			
	}

}
