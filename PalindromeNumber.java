package session18sept;

public class PalindromeNumber {
	public static void main(String args[]){  
		  int sum=0,x;    
		  int n=4544; 
	       x=n;    
		  while(n!=0){    
		   sum=(sum*10)+(n%10);    
		   n=n/10;    
		  } 
		  String results=(x==sum) ? "palindrome number" : "not palindrome number";
		  System.out.println(results); 
           /*using if-else */
		 if(x==sum) {   
		   System.out.println("palindrome number ");    
		  }
		  else    
		   System.out.println("not palindrome");    
		}   

}

