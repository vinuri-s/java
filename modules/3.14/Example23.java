class Example23 {
    public static void myMethod(int x) {
        System.out.println("A");
        System.out.println("B");
        if(x>=100){return;}
        System.out.println("C");
        System.out.println("D");
    }
    public static void main(String args[]) {
        System.out.println("Start main");
        int x=99;
        myMethod(x);
        System.out.println("------------");
        x=101;
        myMethod(x);
        System.out.println("End main");
    }
}
