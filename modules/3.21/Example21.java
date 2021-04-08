import java.util.*;
class Example21{
	
public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		
		//Find digits count
		int temp=num;
		int count=0;
		do{
			count++;
		}while((temp/=10)!=0);
		
		//Create an array
		int[] ar=new int[count];
		
		//Copy digits
		int i=ar.length-1;
		do{
			ar[i--]=num%10;
		}while((num/=10)!=0);
		System.out.println(Arrays.toString(ar));
	}
}
