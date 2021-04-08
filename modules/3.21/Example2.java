import java.util.*;
class Example2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int x[]=new int[10];//int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9;
		//-----------------do not modify--------------
		
		System.out.print("Input number 1 : ");
		x[0]=input.nextInt();

		System.out.print("Input number 2 : ");
		x[1]=input.nextInt();

		System.out.print("Input number 3 : ");
		x[2]=input.nextInt();

		System.out.print("Input number 4 : ");
		x[3]=input.nextInt();

		System.out.print("Input number 5 : ");
		x[4]=input.nextInt();

		System.out.print("Input number 6 : ");
		x[5]=input.nextInt();

		System.out.print("Input number 7 : ");
		x[6]=input.nextInt();

		System.out.print("Input number 8 : ");
		x[7]=input.nextInt();

		System.out.print("Input number 9 : ");
		x[8]=input.nextInt();

		System.out.print("Input number 10: ");
		x[9]=input.nextInt();
		
		
		//-----------------do not modify--------------
		int total=x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]+x[9];
		System.out.print("Total : "+total);
	}
}
