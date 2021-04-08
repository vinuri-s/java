import java.util.*;
class Example13{
	public static void main(String args[]){
		//----------------Method 1----------------------
		int[][] ar=new int[4][3]; //
		
		//----------------Method 2----------------------
		int[][] br=new int[4][];
		System.out.println(br[0]+" "+br[1]+" "+br[2]);// null null null
		br[0]=new int[4];
		br[1]=new int[7];
		br[2]=new int[3];
		br[3]=new int[5];
		
		//----------------Method 3----------------------
		int[][] cr={{3,2,3},{4,5,6,5,4},{5,6},{7,6,7,8,9}};
		
		//----------------Method 4----------------------
		int[][] dr=new int[][]{{3,2,3},{4,5,6,5,4},{5,6},{7,6,7,8,9}};
		
		//----------------Method 5----------------------
		int[][] er={new int[4],new int[7],new int[3], new int[5]};
	}
}
