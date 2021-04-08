import java.util.*;
class Swap{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int x=input.nextInt();

		System.out.print("Input number 2 : ");
		int y=input.nextInt();

		System.out.println(x+" "+y); //eg: 12 13
		int temp = x;
		x=y;
		y=temp;
		System.out.println(x+" "+y); //13 12
	}
}