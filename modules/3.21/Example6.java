import java.util.*;
class Example6{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of students : ");
		final int N=input.nextInt();
		
		//Create an int array size N
		int[] x=new int[N];
		
		
		//Read marks (Input random numbers 0 to 100)
		Random r=new Random();
		for (int i = 0; i < N; i++){
			int rand=r.nextInt(101);
			x[i]=rand;
		}
		
		
		//Find total marks
		int total=0;
		for(int i=0; i<N; i++){
			total+=x[i];
		}
		
		//Find maximum mark
		int max=x[0];
		for(int i=1; i<N; i++){
			if(x[i]>max){
				max=x[i];
			}
		}
		//Find minimum mark
		int min=x[0];
		for(int i=1; i<N; i++){
			if(x[i]<min){
				min=x[i];
			}
		}
		
		//Print marks -->[43, 76, 34, 87, 22, 10, 92, 91, ...]
		System.out.print("[ ");
		for(int i=0; i<N; i++){
			System.out.print(x[i]+", ");
		}
			System.out.println("\b\b]");
		
		
		System.out.println("Total   : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}
