import java.util.*;
//Ex 10 - Fibonacci
class Example15{
	
	public static void printFibonacci(int upto){
		//-------------Process-----------------
	int fn=1,sn=1;
		System.out.print("["+fn+", "+sn+", ");
		int tn=fn+sn;
		while(tn<upto){
			System.out.print(tn+", ");
			fn=sn;
			sn=tn;
			tn=fn+sn;
		}
		System.out.println("\b\b]");
		
	}
	
	public static void main(String args[]) {
        printFibonacci(1000); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 54....]
        
        printFibonacci(10); //[0, 1, 1, 2, 3, 5, 8]
        
        printFibonacci(50); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
    }
}
