package session18sept;


public class ResverseNumber {
	public static void main(String args[]) {
		int number = 987654, reverse = 0;  
		while(number != 0)   
		{  
		reverse = (reverse * 10) + ( number % 10);  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
	

}
