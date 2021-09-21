package Task2Day;

import java.util.Scanner;

public class CountDigits {
	public static void main(String args[]) {
		int a[]=new int[5];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element of array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("array Element : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println("array lenght  : " +a.length);
		}

}
