import java.util.*;
class Example10{
	public static void main(String args[]){
		char[] a=new char[3];
		
		System.out.println("default value of char  : "+a[0]+" "+a[1]+" "+a[2]); //null character, prints nothing, no character defined for ascii code 0

		int code=a[0];
		System.out.println("ASCII of a[0] : "+code); //0
	}
}
