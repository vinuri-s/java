import java.util.*;
class Example4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input number of Students : ");
		final int N=input.nextInt();
		
		int x[]=new int[N];
		
		int total=0;
		
		for(int i=0;i<N;i++){
					
			System.out.print("Input number "+(i+1)+" : ");
			x[i]=input.nextInt();
			
			total=total+x[i];
		
		};
		
		
		System.out.println("Total : "+total);
	}
}
