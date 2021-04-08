import java.util.*;
class Example16{
	public static void increment(int a, int b, int c){
		a++;
		b++;
		c++;
	}
	public static void increment(int[] a){
		a[0]++;
		a[1]++;
		a[2]++;
	}
	public static void main(String args[]){
		int[] ar={10,20,30};
		System.out.println(Arrays.toString(ar)); //10 20 30
		
		increment(ar[0],ar[1],ar[2]);
		System.out.println(Arrays.toString(ar)); //10 20 30
		
		increment(ar);
		System.out.println(Arrays.toString(ar)); //11 21 31
	}
}
