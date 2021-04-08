import java.util.*;
class Example22{
	
	
	public static void findDuplicates(int[] b){
		System.out.print("[ ");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+", ");
		}
			System.out.println("\b\b]");
	}
	
public static void main(String args[]){
	
		Scanner input=new Scanner(System.in);
		int num;
		//Create an array
		int[] ar=new int[size];
	
		for(int i=0;i<size;i++){
		System.out.print("Input an integer : ");
		
		ar[i]=input.nextInt();
		}
		
		findDuplicates(ar);
		
		//System.out.println(Arrays.toString(ar));
		
	}
}
