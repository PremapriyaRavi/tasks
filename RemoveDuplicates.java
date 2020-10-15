package org.tcs;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text=("We learn java basics as part of java sessions in java week1");
		int count=0;
		String[] split = text.split(" ");
		for(int i=0;i<split.length;i++)
		{
		for(int j=0;j<split.length;j++) {
			if(split[i ]==split[j])
			{
              count++;
			}
		    if(count>1)
			split[j].replace("split[j]"," ");
			
		}
		for(String x:split)
			System.out.println(x);
		System.out.println(count);
	
	}
}
}
