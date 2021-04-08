import java.util.*;
class Example15{
	
	public static void printArray(int[] x){
		for(int i=0; i<x.length; i++){
			System.out.print(x[i]+", ");
		}
	}
	
	
	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		printArray(ar);
	}
}
