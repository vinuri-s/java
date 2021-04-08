import java.util.*;
class Age{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Input your age : ");
		int age=input.nextInt();

		System.out.println("Current age : "+age);
		age=age+10;
		System.out.println("Your age after 10 years : "+age);
	}
}