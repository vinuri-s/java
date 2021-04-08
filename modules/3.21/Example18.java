import java.util.*;
class Example18{
	
	public static void reversePrint(int[] a){
		System.out.print("[ ");
		for(int i=a.length-1; i>=0; i--){
			System.out.print(a[i]+", ");
		}
			System.out.println("\b\b]");
	}
	
	
	public static void main(String args[]){
		int[] ar={90,23,78,12,25,52,16,41,31,62,75,19,51,82};
		System.out.println(Arrays.toString(ar));//[90,23,78,12,25,52,16,41,31,62,75,19,51,82]
		
		reversePrint(ar); //[82,51,19,75,62,31,41,16,52, .......]
	}
}
