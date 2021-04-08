import java.util.*;
class Example26{
	
	public static boolean search(int[] ar, int value){
		for(int i=0; i<ar.length; i++){
			if(ar[i]==value){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		int[] ar={90,23,78,12,25,52,16,12,31,62,75,12,51,82};
		System.out.println(Arrays.toString(ar));
		
		if(search(ar,12)){
			System.out.println("value 12 is exists ...");
		}else{
			System.out.println("value 12 is not exists ...");
		}
	}
}
