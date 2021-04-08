import java.util.*;
class 
Example12{
	public static void main(String args[]){
		//----------Method 1---------------
		int[] a=new int[5]; 	
		//int[] b=new int[]; //Illegal
		
		//----------Method 2---------------
		int[] c={10,20,30,40,50};
		int[] d;
		d={10,20,30,40,50}; //Illegal
		
		//----------Method 3---------------
		int[] e=new int[]{10,20,30,40,50};
		int[] f;
		f=new int[]{10,20,30,40,50}; //Legal
		
		int[] g=new int[5]{10,20,30,40,50}; //Illegal
	}
}
