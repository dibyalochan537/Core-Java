package _6_Abstraction_In_Java._1_Abstract_Class;

abstract class FinalMethod{
//    abstract final void myMethod(); //Error
    final void myData(){
        int y=45;
        System.out.println(y);
    }
}
public class _6_finalMethod extends FinalMethod{
//    @Override
//    void myData(){
//
//    }
}
