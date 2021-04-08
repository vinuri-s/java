import java.util.*;
//Ex 3 - Find the maximum
class Example8{
	//Insert code for maximum
	public static int max(int num1,int num2,int num3){
		//-------------Process-----------------
		//Find the maximum
		int max;
		max=num1;
		if(num2>max){
			max=num2;
		}
		if(num3>max){
			max=num3;
		}
		
		return max;
	}
	
	public static void main(String args[]){
		System.out.println("max of 10,30,20 is : "+max(10,30,20));
	}
}
