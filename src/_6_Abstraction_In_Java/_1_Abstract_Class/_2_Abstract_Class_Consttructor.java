package _6_Abstraction_In_Java._1_Abstract_Class;

abstract class MyClassConstructor{
    MyClassConstructor(String y){
        System.out.println("I am parent and Abstract class !! & Constructor overloading");
    }
    MyClassConstructor(int x){
        System.out.println("I am parent and Abstract class !! & Constructor overloading");
    }
}
public class _2_Abstract_Class_Consttructor extends MyClassConstructor{
    _2_Abstract_Class_Consttructor(){
        super(50);
    }
    _2_Abstract_Class_Consttructor(String y){
        super(y);
    }
    public static void main(String[] args) {
        _2_Abstract_Class_Consttructor obj=new _2_Abstract_Class_Consttructor();
        _2_Abstract_Class_Consttructor obj2=new _2_Abstract_Class_Consttructor("Raju");
    }
}
