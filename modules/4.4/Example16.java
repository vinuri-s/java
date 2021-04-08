import java.util.*;
class Example16{
	public static void main(String args[]){
		int a=0;
		int[] b=new int[3];
		int[][] c=new int[3][3];
		int[][][] d =new int[3][3][3];
		int[][][][] e =new int[3][3][3][4];
		
		a=b;
		c=b;
		c[0]=b;
		b[0]=a;
		b[0]=c[0][0];
		c[0]=d[0][0];
		
}
