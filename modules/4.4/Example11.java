import java.util.*;
class Example11{
	public static void main(String args[]){
		int[] ar;
		ar=new int[5];	
		System.out.println(ar);//array memory address
		System.out.println(ar[0]);
		
		int[][] br;
		br=new int[5][3];
		System.out.println(br);//whole array memory address
		System.out.println(br[0]);//1st array memory address
		System.out.println(br[0][0]);
	}
}
