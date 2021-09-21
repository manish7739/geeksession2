package session18sept;
import java.util.Scanner;

public class SecondMethodPalindrome {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any string");
		String str=sc.nextLine();
		int length=str.length();
		System.out.println("length of String : " +length);
		if(length%2!=0) {
			for(int i=0; i<length/2; i++) {
				if(str.charAt(i)==str.charAt(length-1-i))
				{
					continue;
				}
				else {
					System.out.println("String is palindrome");
					break;
				}
			}
			
		}
		else {
			for(int i=0; i<length/2; i++) {
				if(str.charAt(i) == str.charAt(length-1-i))
				{
					continue;
				}
				else {
					System.out.println("String is not palindrome");
					break;
				}
			}
			
		}
	}

}
