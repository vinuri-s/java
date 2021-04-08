import java.util.*;
//Ex 2 - Find sum of digits 
class Example7{
	
	public static int findSumOfDigits(int no){
		//-------------Process-----------------
		//Find sum of digits 
		int sum=0;
		
		while(no!=0){
			sum+=no%10;
			no/=10;
		}
		return sum;
	}

	public static void main(String args[]){
		Scanner input=new Scanner(System.in); 
		System.out.print("Input a number : ");
		int num=input.nextInt();
		int sum=findSumOfDigits(num);
		System.out.println("Sum of digits for"+num+" : "+sum);
	}
}
