package org.tcs;

public class College extends University {
	public void ug() {
		System.out.println("engineering");
	}
	public static void main(String[] args) {
		College c=new College();
		c.pg();
		c.ug();
	}
}
