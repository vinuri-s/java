import java.util.*;
//Ex 7 - Odd/Even
class Example12{
	
	public static boolean isEven(int num){
		//-------------Process-----------------
		return num%2==0;
	}
	
	public static void main(String args[]){
		Random r=new Random();
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt(101);
        	if(isEven(rand)){
				System.out.println(rand+" is even....");
			}else{
				System.out.println(rand+" is odd...");
			}		
		}
	}
}
