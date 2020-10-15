package org.tcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Companies {

	public static void main(String[] args) {
		String[] company= {"TCS","Wipro","Infosys","Fis","Tcs","Wipro"};
		List<String> li=new ArrayList<String>();
		for(String x:company) {
		  li.add(x); 
		}
		Collections.sort(li);	
		System.out.println(li);
		System.out.println();
		Set<String> s=new LinkedHashSet<String>();
		
		for(String x1:company)
		{
		s.add(x1);
        }
		System.out.println(s);
}
}