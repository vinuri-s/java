import java.util.*;
class Example5{
	public static void main(String args[]){
		final int N=10; //No of students
		final int S=4; //No of subjects
		
		int[][] marks=new int[N][S];
		
		Scanner input=new Scanner(System.in);
		
		//Read marks for students 1....
		System.out.println("Input marks for student 1....");
		for(int j=0; j<S; j++){
			System.out.print("\tSubject"+(j+1)+" : ");
			marks[0][j]=input.nextInt();
		}
		
		//Read marks for students 2....
		System.out.println("Input marks for student 2....");
		for(int j=0; j<S; j++){
			System.out.print("\tSubject"+(j+1)+" : ");
			marks[1][j]=input.nextInt();
		}
			
	}
}
