import java.util.*;
//Parameterized Methods
class Example3{
	public static void printTotal(int num1,int num2){
		//-------------Process-----------------
		int total;
		total=num1+num2;
		
		//--------------Output-----------------
		System.out.println(num1+" + "+num2+" = "+total);
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt();
		System.out.print("Input number 2 : ");
		int num2=input.nextInt();
						
		printTotal(num1,num2);//num1 and num2 are arguments
	}
}
