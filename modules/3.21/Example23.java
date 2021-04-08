import java.util.*;
class Example23{
	
	public static int search(int[] a,int b){
		int target=-1;
		for (int i = 0; i < a.length; i++){
			if(a[i]==b){
				target=i;
			}
		}
		return target;
	}
	
	public static void main(String args[]){
		int[] ar={90,23,78,12,25,52,16,41,31,62,75,19,51,82};
		System.out.println(Arrays.toString(ar));
		
		int index;
		index=search(ar,12);
		System.out.println("Index of 12 : "+index); //3
		
		index=search(ar,16);
		System.out.println("Index of 16 : "+index); //6
		
		index=search(ar,99);
		System.out.println("Index of 99 : "+index); //-1
	}
}
