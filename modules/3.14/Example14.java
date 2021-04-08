import java.util.*;
//Ex 9 - Palindrome
class Example14{
	
	public static int reverse(int no){
		//-------------Process-----------------
	//Find the reverse of num
		int rev=0;
		while(no!=0){
			rev*=10;
			rev+=no%10;
			no/=10;
			
		}		

		return rev;
	}
	
	
	public static boolean isPalindrome(int num){
		//-------------Process-----------------
		return reverse(num)==num;
	}
	
public static void main(String args[]){
		for (int i = 0; i < 10000; i++){
			if(isPalindrome(i)){
				System.out.println(i);
			}
		}
	}
}
