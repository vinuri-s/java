import java.util.*;
class Example19{
	
	public static void copyValuesFromTo(int[] x, int[] y){
		for (int i = 0; i < (x.length<y.length ? x.length:y.length); i++){
			y[i]=x[i];
		}
		
	}
	public static void main(String args[]){
		int[] ar={90,23,78,12,25,52,16,41,31,62,75,19,51,82};
		int[] br=new int[ar.length];
		int[] cr=new int[ar.length+5];
		int[] dr=new int[ar.length-5];
				
		System.out.println(Arrays.toString(ar));//[90,23,78,12,25,52,16,41,31,62,75,19,51,82]
		System.out.println(Arrays.toString(br));//[0,0,0,0,0,0,0,0,0,0,0,0,0,0,...]
		System.out.println(Arrays.toString(cr));//[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
		System.out.println(Arrays.toString(dr));//[0,0,0,0,0,0,0,0]
		
		copyValuesFromTo(ar,br);
		copyValuesFromTo(ar,cr);
		copyValuesFromTo(ar,dr);
		
		System.out.println(Arrays.toString(ar));//[90,23,78,12,25,52,16,41,31,62,75,19,51,82]
		System.out.println(Arrays.toString(br));//[90,23,78,12,25,52,16,41,31,62,75,19,51,82]
		System.out.println(Arrays.toString(cr));//[90,23,78,12,25,52,16,41,31,62,75,19,51,82,0,0,0,0,0]
		System.out.println(Arrays.toString(dr));//[90,23,78,12,25,52,16,41,31]
		
	}
}
