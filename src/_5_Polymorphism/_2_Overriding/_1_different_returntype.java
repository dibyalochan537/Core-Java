package _5_Polymorphism._2_Overriding;

public class _1_different_returntype {
    _1_different_returntype show(){
        System.out.println("Parent");
        return new _1_different_returntype();
    }
}
class returntype extends _1_different_returntype{
    @Override
    returntype show(){
        return new returntype();
//        return null;
    }
}
