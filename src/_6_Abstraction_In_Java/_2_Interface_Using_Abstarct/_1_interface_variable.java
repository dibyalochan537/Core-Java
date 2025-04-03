package _6_Abstraction_In_Java._2_Interface_Using_Abstarct;
interface A{
    int x=98;
    void y();
}
interface B{
    int x=78;
    void y();
}
public class _1_interface_variable implements A,B{
    public void y(){

    }
    public static void main(String[] args) {
        _1_interface_variable obj=new _1_interface_variable();
        _1_interface_variable obj2=new _1_interface_variable();
//        System.out.println(obj.x);
//        obj2.x=56;

    }
}
