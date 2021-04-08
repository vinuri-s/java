class Unicode{
	public static void main(String args[]){
		char ch='A';
		System.out.println(ch); //prints A
		ch=97; //ASCII of a
		System.out.println(ch); //prints a

		System.out.println(65); //Integer Literals 
		System.out.println('\u0041'); //Unicode Character Literals A
		
		char \u0061; //char a;
		\u0061='\u0061'; 
		System.out.println(\u0061); //prints a

		// \u0061---> unicode character a
		// '\u0061'-> unicode character literal 'a'

		
	}
}

