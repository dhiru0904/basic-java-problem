public class VariableBlockMethod {
    //static variable
    static int c=5;
    static int d;
    //static block
    static
    {
        System.out.println("static block initialize-------");
        d=c+6;
    }
    //static method
    static int add(int a,int b)
    {
        int s=a+b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10 is:"+add(5,10));
    }
}
