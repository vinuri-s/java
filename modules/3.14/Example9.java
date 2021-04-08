import java.util.*;
//Ex 4 - Find the factorial
class Example9{

	public static int fact(int no){
		//-------------Process-----------------
		int factorial=1;
		while(no>0){
			factorial*=no--;
		}
		return factorial;
	}

		
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			System.out.println(i+" ! = "+fact(i));
		}
	}
}
