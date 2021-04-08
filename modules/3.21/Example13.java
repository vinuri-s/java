import java.util.*;
class Example13{
	public static void main(String args[]){
		int[] ar={32,12,54,56,76,78,65,34,21,43,65,87};
		System.out.println("Array size: "+ar.length);
		
		//print elements  //32,12,54,56,76,78,65,34,21,43,65,87
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+", ");
		}
		System.out.println("\b\b");
	}
}
