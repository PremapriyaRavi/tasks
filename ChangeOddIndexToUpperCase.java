package org.tcs;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test="changeme";
		char[] a = test.toCharArray();
		int len = a.length;
			for(int i=len;i>=0;i--)
				if(i%2!=0)
					a[i]=(char)(a[i]-32);
			for(char a1:a)
			{
				System.out.print(a1);
				
				
			}
				
	}

}
