package _5_Polymorphism._6_Final_KeyWord;

public class _2_used_final_method_override {
    final public void myMethod(){
        System.out.println("I am Parent Class Method");
    }
}
class testOverride extends _2_used_final_method_override{
//    @Override
//    public void myMethod(){
//
//    }
    //we cannot override final method
}
