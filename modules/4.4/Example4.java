import java.util.*;
class Example4{
	public static void sort(int[] a){
		for(int i=a.length;i>0;i--){
		int max=a[0];
		int index = 0;
	
		
		for(int j=1;j<i;j++){
		
			if(a[j]>max){			
				max=a[j];
				index=j;
				}
				
				
			}
			a[index]=a[i-1];
			a[i-1]=max;
			
		}
	}
	
	public static void main(String args[]){
		
		int[] ar={90,23,78,25,52,16,12,31,62,75,51,82};
		System.out.println(Arrays.toString(ar));
		sort(ar);
		System.out.println(Arrays.toString(ar));
	}
	//h.w- insertion sort
}
