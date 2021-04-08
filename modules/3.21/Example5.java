import java.util.*;
class Example5{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of students : ");
		final int N=input.nextInt();
		
		//Create an int array size N
		int[] x=new int[N];
		
		//Read marks ()
		for(int i=0; i<N; i++){	
			System.out.print("Input number "+(i+1)+" : ");
			x[i]=input.nextInt();
		}
		
		//Find total marks
		int total=0;
		for(int i=0; i<N; i++){
			total+=x[i];
		}
		
		int max=x[0];
		//Find maximum mark
		for(int i=1; i<N; i++){
			
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		
		int min=x[0];
		//Find minimum mark
		for(int i=1; i<N; i++){
			
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		
		//Print
		System.out.println("Total   : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}
