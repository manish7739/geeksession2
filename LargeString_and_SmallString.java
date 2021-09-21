package session18sept;
import java.util.Scanner;


public class LargeString_and_SmallString {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your String : ");
		String name=sc.nextLine();
		
		int ln=name.length();
		if(ln>=4) {
			System.out.println("this string is long name");
		}
		else {
			System.out.println("this string is short name");
		}
	}

}
