import java.util.*;
class Example14{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("No of students : ");
		final int N=input.nextInt();
		int[][] marks=new int[N][];
		
		for (int i = 0; i < N; i++){
			System.out.print("No of subjects for students"+(i+1)+" : ");
			int s=input.nextInt();
			marks[i]=new int[s];
		}
		
		//Prints marks
		for(int i=0; i<marks.length; i++){//marks[i].length very very important:)
		
			for(int j=0; j<marks[i].length; j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println();
		}
			
}		
		
	}


