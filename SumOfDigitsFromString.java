package org.tcs;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		String text="Test12Le79af65";
		int sum=0;
		String s = text.replaceAll("[A-Z]"," ");
		String s1 = s.replaceAll("[a-z]"," ");
		char[] a = s1.toCharArray();
		for(int i=0;i<a.length;i++) {
			int numericValue = Character.getNumericValue(a[i]);
			System.out.println(numericValue);
			sum=sum+numericValue;
		}	
		System.out.println(sum);
	}

}
