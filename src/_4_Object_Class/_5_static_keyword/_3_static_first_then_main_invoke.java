package _3_Object_Class._5_static_keyword;

public class _3_static_first_then_main_invoke {
    private static int x;
    static{
        x=54;
        System.out.println("I am static block");
    }
    public static void main(String[] args) {
        System.out.println("I am main method");
        System.out.println(x);
    }
}
