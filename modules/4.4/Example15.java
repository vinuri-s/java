 import java.util.*;
class Example15{
	public static void main(String args[]){
		int[][] cr={{3,2,3},{4,5,6,5,4},{5,6},{7,6,7,8,9}};
		//
		for(int[] ar : cr){
			for(int a : ar){
				System.out.print(a+"  ");
			}
			System.out.println();
		}
	}
}
