package com.testng.samples;

import java.util.Scanner;
/**
 * 
 * @author Ashwith
 *
 */
public class Sample1 {
/**
 * Main meethod
 * @param args
 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println(add(a,b));
		scanner.close();
	
	}
	/**
	 * Method to Add the 2 numbers Without "+" operator
	 * @param a
	 * @param b
	 * @return
	 */
public static int add(int a,int b) {
	while(b!=0)
	{
		int carry=a&b;
		a=a^b;
		b=carry<<1;
	}
	return a;
}
}
