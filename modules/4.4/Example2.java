import java.util.*;
class Example2{
	public static void sort(int[] a){
		for(int j=a.length-1; j>0; j--){
			for(int i=0; i<j; i++){
				if(a[i]>a[i+1]){
					int t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
				System.out.println(Arrays.toString(a));	
				try{Thread.sleep(500);}catch(Exception ex){}
			}
		}
	}
	public static void main(String args[]){
		int[] ar={90,80,70,60,50,40,30,20,10,0};
		System.out.println(Arrays.toString(ar));//[90,80,70,60,50,40,30,20,10,0]
		sort(ar);
		System.out.println(Arrays.toString(ar));//[0,10,20,30,40,50,60,70,80,90]
	}
	
	
	//h.w- sort a binary array with a single loop
}
