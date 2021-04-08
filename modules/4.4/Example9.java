import java.util.*;
class Example9{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		System.out.print("Input no of subjects : ");
		final int S=input.nextInt();
		
		int[][] marks=new int[N][S];
		int[] stNo=new int[N];
		int[] stTot=new int[N];
		
		//Read marks for students
		Random r=new Random();
		for(int i=0; i<N; i++){
			stNo[i]=r.nextInt(10000);
			for(int j=0; j<S; j++){
				marks[i][j]=r.nextInt(101);
			}
		}
		
		//Find students' totals
		for(int i=0; i<N; i++){
			int tot=0;
			for(int j=0; j<S; j++){
				tot+=marks[i][j];
			}
			stTot[i]=tot;
		}


		//Print marks students
		System.out.print("StNo\t");
		for(int j=0; j<S; j++){
			System.out.print("Sub"+(j+1)+"\t");
		}
		System.out.println("Tot");
		for(int i=0; i<N; i++){
			System.out.print(stNo[i]+"\t");
			for(int j=0; j<S; j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println(stTot[i]+"\t");
		}
	
	}
}
