import java.util.*;
class Example2{
	//-----------------start Method declaration--------------
	public static void printTotal(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		int num1=input.nextInt();
		
		System.out.println("Enter number 2:");
		int num2=input.nextInt();
		
		System.out.println("The total is: " + (num1+num2));
	}
	//-----------------End Method declaration--------------
	
	//-----------------start main Method declaration--------------
	public static void main(String args[]){
		
		printTotal(); //Method calling statement
	}
	//-----------------end main Method declaration--------------
}
