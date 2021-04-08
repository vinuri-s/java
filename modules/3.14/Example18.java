class 
Example18{
	public static void myMethod2(){
		System.out.println("myMethod2()");
		myMethod1();
	}
	public static void main(String args[]) {
		myMethod2();
    }
    public static void myMethod1(){
		System.out.println("myMethod1()");
	}
}
