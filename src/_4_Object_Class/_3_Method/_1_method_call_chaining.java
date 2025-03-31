package _3_Object_Class._3_Method;

public class _1_method_call_chaining {
    Integer myName(){
        System.out.println("I am raju");
        return 20;
    }
    void myAge(){
        System.out.println("I am 23 years old");
    }
    void ds(){
        System.out.println("I am 23 years old");
    }

    public static void main(String[] args) {
        _1_method_call_chaining obj=new _1_method_call_chaining();
        obj.myName();
    }
}
