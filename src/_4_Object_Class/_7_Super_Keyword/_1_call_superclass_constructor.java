package _3_Object_Class._7_Super_Keyword;

public class _1_call_superclass_constructor{
    _1_call_superclass_constructor(){
        System.out.println("I am parent class !!");
    }
    public static void main(String[] args) {
        _1_call_superclass_constructor obj=new _1_call_superclass_constructor();
    }
}
class childClass extends _1_call_superclass_constructor{
    childClass(){
        super();
    }
}