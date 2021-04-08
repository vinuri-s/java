import java.util.*;
class Example1{
	
	public static void sort(int[] a){
		
		for(int j=0;j<a.length-1;j++){//all the maximum vals goes to the end
		
		for(int i=0;i<a.length-1;i++){
		//the maximum val atm goes to the end
		if(a[i]>a[i+1]){
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
			}
		}
		
	}
	}
	
	
	public static void main(String args[]){
		int[] ar={90,23,78,25,52,16,12,31,62,75,51,82};
		System.out.println(Arrays.toString(ar));//[90,23,78,25,52,16,12,31,62,75,51,82]
		sort(ar);
		System.out.println(Arrays.toString(ar));//[12,16,23,25,31,...]
	}
}
