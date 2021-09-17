package com.geekster;

public class B {
	public void add() {
		
		int a=2,b=3,sum;
		sum=a+b;
		System.out.println("Sum of two number :"  +sum);
		sub();//static method
	  }
    private static void sub() {
		
		int x=4,y=10,sub;
		sub=y-x;
		System.out.println("Subtract of two number :"  +sub);
	}

}
