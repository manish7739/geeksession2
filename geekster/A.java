package com.geekster;
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
		
		B obj= new B();
		obj.add();
		
   
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter First Number : ");
				int a=sc.nextInt();
				 System.out.println("Enter Second Number : ");
					int b=sc.nextInt();
					int sum=a+b;
					System.out.println("sum : " + sum);
		
	}
}
