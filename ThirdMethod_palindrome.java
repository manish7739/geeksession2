package session18sept;
import java.util.Scanner;

public class ThirdMethod_palindrome {
public static void main(String args[]) {
	 String rev="";
	System.out.println("Enter String for check palindrome or not");
	Scanner sc =new Scanner(System.in);
   String str=sc.nextLine();
  
   for(int i=str.length()-1 ; i>=0; i--) {
	   rev= rev+str.charAt(i);   
   }
   if(str.equals(rev)) {
	   System.out.println("this is palindrome");
   }
   else {
	   System.out.println("this is not palindrome");
   }
   
}
}
