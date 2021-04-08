import java.util.*;
//Ex 8 - Reverse
class Example13{
	
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
public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt(); //12345
		
		int reverse=reverse(num);
		System.out.println("Reverse of "+num+" : "+reverse);//54321
    }
}
