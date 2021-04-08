import java.util.*;
class Example7{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		//Create an double array size 12
		double[] avg=new double[12];
		
		
		//Read marks 
		for(int i=0; i<12; i++){	
			System.out.print("Input number "+(i+1)+" : ");
			avg[i]=input.nextDouble();
		}
		
		avg[4]=67.0;
		
		//Find total marks
		double total=0;
		for(int i=0; i<12; i++){
			total+=x[i];
		}
		
		double average=total/12;
		
		//Print
		System.out.println("Average   : "+average);
		
	}
}
