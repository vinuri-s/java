//Ex 1 - Find Digit Count
import java.util.*;
class Example6{
	
	public static int findDigitCount(int no){
		//-------------Process-----------------
		int count=0;
		while(no!=0){	
			no/=10;
			count++;
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		int count=findDigitCount(num);
		System.out.println("No of digits for "+num+" : "+count);
	}
}

