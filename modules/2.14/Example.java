class Example{
	public static void main(String args[]){
		System.out.println(2147483647); //Legal ->max of int(32bits)
		System.out.println(-2147483648); //Legal->min of int

		//System.out.println(2147483648); //Illegal
		//System.out.println(-2147483649); //Illegal

		System.out.println(2147483648L); //Illegal
		System.out.println(-2147483649L); //Illegal

	}
}
