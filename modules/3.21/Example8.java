import java.util.*;
class Example8{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of students : ");
		final int N=input.nextInt();
		
		//1. Create an int array size N, named "marks"
		int marks[]=new int[N];
		
		
		//2. Read marks (Input random numbers 0 to 100)
		Random r=new Random();
		for (int i = 0; i < N; i++){
			int rand=r.nextInt(101);
			marks[i]=rand;
		}
		
		int total=0;
		//3. Find total marks
		for(int i=0;i<N;i++){
			total+=marks[i];
		}
		
		//4. Find maximum mark
		int max=marks[0];
		for(int i=1;i<N;i++){
			if(marks[i]>max){
				max=marks[i];
				}
		}
		
		//5. Find minimum mark
		int min=marks[0];
		for(int i=1;i<N;i++){
			if(marks[i]<min){
				min=marks[i];
				}
		}
		
		//6. Print marks -->[43, 76, 34, 87, 22, 10, 92, 91, ...]
		System.out.print("[");
		for(int i=0;i<N;i++){
			System.out.print(marks[i]+", ");
		}
		System.out.println("\b\b]");
		
		System.out.println("Total   : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}
