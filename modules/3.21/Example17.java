import java.util.*;
class Example17{
	public static int[] createAnArray(int size){
		int[] temp=new int[size];
		return temp;
	}
	
	public static void readMarks(int[] x){
		Random r=new Random();
		for (int i = 0; i < x.length; i++){
			int rand=r.nextInt(101);
			x[i]=rand;
		}
		
	}
	
	public static int findTotal(int[] y){
			int tot=0;
		for (int i = 0; i < y.length; i++){
			tot+=y[i];
		}
		return tot;
	}
	
	public static int findMax(int[] z){
		int max=z[0];
		for(int i=1; i<z.length; i++){
			if(z[i]>max){
				max=z[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] a){
		int min=a[0];
		for(int i=1; i<a.length; i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
	}
	
	public static void printMark(int[] b){
		System.out.print("[ ");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+", ");
		}
			System.out.println("\b\b]");
	}
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of students : ");
		final int N=input.nextInt();
		
		//1. Create an int array size N, named "marks"
		int[] marks=createAnArray(N);
		
		//2. Read marks (Input random numbers 0 to 100)
		readMarks(marks);
		
		//3. Find total marks
		int total;
		total=findTotal(marks);
		
		//4. Find maximum mark
		int max;
		max=findMax(marks);
		
		//5. Find minimum mark
		int min;
		min=findMin(marks);
		
		//6. Print marks -->[43, 76, 34, 87, 22, 10, 92, 91, ...]
		printMark(marks);
		
		System.out.println("Total   : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
}
