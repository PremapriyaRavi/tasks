package org.tcs;

public class Splits {
	public static void main(String[] args) {
		String s="how are you?";
				String[] split = s.split(" ");
				for(int i=0;i<split.length;i++)
					System.out.print(split[i]);
				System.out.println();
				for(int i=split.length-1;i>=0;i--)
					System.out.print(split[i]);
	}

}
