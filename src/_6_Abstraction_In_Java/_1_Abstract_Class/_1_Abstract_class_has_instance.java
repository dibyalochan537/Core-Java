package _6_Abstraction_In_Java._1_Abstract_Class;

public class _1_Abstract_class_has_instance extends MyClass {
    _1_Abstract_class_has_instance(){
        super();
    }
    public static void main(String[] args) {
        _1_Abstract_class_has_instance obj=new _1_Abstract_class_has_instance();
    }
}
abstract class MyClass{
//    public static void main(String[] args) {
////        MyClass obj=new MyClass();
//    }
    MyClass(){
        System.out.println("I am abstract class");
    }
}
