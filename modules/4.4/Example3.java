import java.util.*;
class Example3{
	public static void sort(int[] a){
		
		int max=a[0];
		int index = 0;
		
		for(int j=1;j<a.length-1;j++){
			
			if(a[j]>max){			
				max=a[j];
				index=j;
				}
			}
			a[index]=a[a.length-1];
			a[a.length-1]=max;
			
			//second maximum swap
			
			max=a[0];
			index = 0;
			for(int j=1;j<a.length-1;j++){
			
			if(a[j]>max){			
				max=a[j];
				index=j;
				}
			}
			
			a[index]=a[a.length-2];
			a[a.length-2]=max;
			
			//third maximum swap
			
			max=a[0];
			index = 0;
			for(int j=1;j<a.length-2;j++){
			
			if(a[j]>max){			
				max=a[j];
				index=j;
				}
			}
			
			a[index]=a[a.length-3];
			a[a.length-3]=max;
			
	}
	
	public static void main(String args[]){
		
		int[] ar={90,23,78,25,52,16,12,31,62,75,51,82};
		System.out.println(Arrays.toString(ar));
		sort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
