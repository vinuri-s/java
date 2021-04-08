import java.util.*;
class Example10{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		System.out.print("Input no of subjects : ");
		final int S=input.nextInt();
		
		int[][] marks=new int[N][S];
		int[] stNo=new int[N];
		int[] stTot=new int[N];
		int[] stMax=new int[N];
		
		int[] subTot=new int[S];
		
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

		//find student's maximum
		for(int i=0; i<N; i++){
			int max=marks[i][0];
			for(int j=1; j<S; j++){
				if(marks[i][j]>max){
					max=marks[i][j];
				}
			}
			stMax[i]=max;
		}

		//find subjects totals
		for(int j=0; j<S; j++){
			int tot=0;
			for(int i=0; i<N; i++){
				tot+=marks[i][j];
			}
			subTot[j]=tot;
		}


		//Print marks students
		System.out.print("StNo\t");
		for(int j=0; j<S; j++){
			System.out.print("Sub"+(j+1)+"\t");
		}
		System.out.println("Tot\tMax");
		for(int i=0; i<N; i++){
			System.out.print(stNo[i]+"\t");
			for(int j=0; j<S; j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println(stTot[i]+"\t"+stMax[i]);
		}
		System.out.print("Tot\t");
		for(int j=0; j<S; j++){
			System.out.print(subTot[j]+"\t");
		}
		System.out.println();
	}
}
