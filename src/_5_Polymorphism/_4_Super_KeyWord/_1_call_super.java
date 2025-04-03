package _5_Polymorphism._4_Super_KeyWord;

public class _1_call_super {
    int x=98;
    _1_call_super(){
        System.out.println("I am Parent");
    }
    public static void main(String[] args) {
//        _1_call_super obj=new _1_call_super();
        testSuper obj1=new testSuper();
    }
}
class testSuper extends _1_call_super{
    testSuper(){
//        super();
        System.out.println(super.x);
    }
    void myMethod(){
        System.out.println("I am child class method");
    }
}
