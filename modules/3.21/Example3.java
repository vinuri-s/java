import java.util.*;
class Example3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int x[]=new int[10];//int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9;
		
		//int total=0;
		
		for(int i=0;i<10;i++){
					
			System.out.print("Input number "+ (i+1)+" : ");
			x[i]=input.nextInt();
			//total=total+x[i];
		
		};
		
		
		int total=x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]+x[9];
		System.out.println("Total : "+total);
	}
}
