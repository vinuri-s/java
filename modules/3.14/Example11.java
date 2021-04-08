import java.util.*;
//Ex 6 - Find student grade
class Example11{
	//Insert code here
	public static char findStudentGrade(double avg){
		//-------------Process-----------------
		char grade = avg>=75 ? 'A': avg>=65 ? 'B': avg>=45 ? 'C':avg>=25 ? 'C':'E';
		return grade;
	}


	
	public static void main(String args[]){
		char grade;
		grade=findStudentGrade(78.1);
		System.out.println("78.1 : "+grade); //A
		System.out.println("65.0 : "+findStudentGrade(65.0));	//B
	}
}
