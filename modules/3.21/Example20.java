import java.util.*;
class Example20{
	
	public static boolean equals(int[] x, int[] y){
		
		boolean a=true;
		
		for (int i = 0; i < y.length; i++){
			if(y[i]!=x[i]){
				a=false;
				break;				}				
		}
		return a;
	}
	/*
	 public static boolean equals(int[] x, int[] y){
		
		for (int i = 0; i < y.length; i++){
			if(y[i]!=x[i]){
				return false;
		}
		return true;
	}

	 */

	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		int[] br={10,20,30,40,50,60};
		int[] cr={10,20,99,40,50};
		int[] dr={40,20,10,50,30};
		int[] er={10,20,30,40};
		int[] fr={10,20,30,40,50};
		//System.out.println("ar==br : "+equals(ar,br)); //false
		//System.out.println("ar==cr : "+equals(ar,cr)); //false
		//System.out.println("ar==dr : "+equals(ar,dr)); //false
		//System.out.println("ar==er : "+equals(ar,er)); //false
		System.out.println("ar==fr : "+equals(ar,fr)); //true
	}
}
