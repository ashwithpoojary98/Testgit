package com.testng.samples;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of A and B");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println(add(a,b));
		scanner.close();
	
	}
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
