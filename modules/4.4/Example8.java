import java.util.*;
class Example8{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		System.out.print("Input no of subjects : ");
		final int S=input.nextInt();
		
		int[][] marks=new int[N][S];
		int[] stNo=new int[N];
		
		//Read marks for students
		Random r=new Random();
		for(int i=0; i<N; i++){
			stNo[i]=r.nextInt(10000);
			for(int j=0; j<S; j++){
				marks[i][j]=r.nextInt(101);
			}
		}
		
		//Print marks students
		System.out.print("StNo\t");
		for(int j=0; j<S; j++){
			System.out.print("Sub"+(j+1)+"\t");
		}
		System.out.println();
		for(int i=0; i<N; i++){
			System.out.print(stNo[i]+"\t");
			for(int j=0; j<S; j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println();
		}
	
	}
}
