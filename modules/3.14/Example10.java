import java.util.*;
//Ex 5 - Find the absolute
class Example10{
	//Insert code here
	public static int findAbsolute(int x){
		//-------------Process-----------------
		int abs;
		abs= x<0 ? -x : x;
		return abs;
	}


	
	public static void main(String args[]){
		Random r=new Random();
		for (int i = 0; i < 100; i++){
			int rand=r.nextInt(); //min of int to max of int
			int abs=findAbsolute(rand);
			System.out.println("absolute value of "+rand+" is : "+abs);	
		}
	}
}
