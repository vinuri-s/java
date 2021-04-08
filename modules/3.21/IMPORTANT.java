import java.util.*;
class IMPORTANT{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int num;
		int[] ar=new int[1];
		System.out.print("Input an integer : ");
		num=input.nextInt();
		ar[0]=num;
		
		System.out.print("Input an integer : ");
		num=input.nextInt();
		int[] temp=new int[2];
		temp[0]=ar[0];
		temp[1]=num;
		ar=temp;
		
		System.out.print("Input an integer : ");
		num=input.nextInt();
		temp=new int[3];
		temp[0]=ar[0];
		temp[1]=ar[1];
		temp[2]=num;
		ar=temp;
		
		System.out.print("Input an integer : ");
		num=input.nextInt();
		temp=new int[4];
		temp[0]=ar[0];
		temp[1]=ar[1];
		temp[2]=ar[2];
		temp[3]=num;
		ar=temp;
		
		System.out.println(Arrays.toString(ar));
	}
}
