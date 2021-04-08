class Example21{
	public static double  average(int total, int n){	
		double avg=(double)total/n;
		return avg;
	}		
	public static void main(String args[]){
		int totalMarks=899;
		int no_of_students=10;
		double avg=average(no_of_students,totalMarks);
		System.out.println("Average : "+avg);	

		avg=average(totalMarks,no_of_students);
		System.out.println("Average : "+avg);			
	}
}
