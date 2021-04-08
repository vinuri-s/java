import java.util.*;
class Example6{
	public static void main(String args[]){
		final int N=2; //No of students
		final int S=4; //No of subjects
		
		int[][] marks=new int[N][S];
		
		Scanner input=new Scanner(System.in);
		
		for(int i=0; i<N; i++){
		//Read marks for students 1....
		System.out.println("Input marks for student "+(i+1));
		for(int j=0; j<S; j++){
			System.out.print("\tSubject"+(j+1)+" : ");
			marks[0][j]=input.nextInt();
		}
	}
	
	//print marks
		for(int i=0; i<N; i++){
		for(int j=0; j<S; j++){
			System.out.print(marks[i][j]+"\t");
		}
		System.out.println();
	}
	
			
	}
}
