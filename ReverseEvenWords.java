package org.tcs;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test="I am a software tester";
		String[] split = test.split(" ");
		for(int i=split.length-1;i>=0;i--)
			if(i%2!=0) {
				String[] split2 = split[i].split("");
				for(int j=split2.length-1;j>=0;j--)
				{
					if(j%2==0)
						System.out.println(split2[j].toCharArray());
					else
						System.out.println(split2[j]+" ");
				
			     }
			
			
	}
	}
}
