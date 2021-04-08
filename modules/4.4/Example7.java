import java.util.*;
class Example7{
	public static void main(String args[]){
		final int N=2; //No of students
		final int S=4; //No of subjects
		
		int[][] marks=new int[N][S];
		
		Scanner input=new Scanner(System.in);
		
		Random r=new Random();
		
		for(int i=0; i<N; i++){
		
		for(int j=0; j<S; j++){
		
			marks[i][j]=r.nextInt(101);
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
