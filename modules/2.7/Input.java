import java.util.*;
class Input{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int x,y,z;
		System.out.print("Input number 1 : ");
		x=input.nextInt();
		System.out.print("Input number 2 : ");
		y=input.nextInt();
		System.out.println();
		z=x+y;
		System.out.print(x+" + "+y+" = "+z); // 100 + 200 = 300
	}
}