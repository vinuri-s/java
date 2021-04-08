import java.util.*;
class Example25{
	public static int search(int[] ar, int value){
		for(int i=0; i<ar.length; i++){
			if(ar[i]==value){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int[] ar={90,23,78,12,25,52,16,12,31,62,75,12,51,82};
		System.out.println(Arrays.toString(ar));
		
		int index;
		index=search(ar,12);
		System.out.println("Index of 12 : "+index); //3
		
		index=search(ar,99);
		System.out.println("Index of 99 : "+index); //-1
	}
}
