package org.tcs;

public class FindTypes {
	public static void main(String[] args) {
		String test="$$ to 2nd class of Automation $$";
		char[] a= test.toCharArray();
		int letter =0,space=0,num=0,specialChar=0;
		for(int i=0;i<a.length;i++)
		{
		if(Character.isLetter(a[i]))
			letter++;
		else if(Character.isDigit(a[i]))
			num++;
		else if(Character.isSpaceChar(a[i]))
			space++;
		else
			specialChar++;
		}
		
		System.out.println("number="+num);
		System.out.println("space="+space);
		System.out.println("letter="+letter);
		System.out.println("specialChar="+specialChar);
			
	}

}
