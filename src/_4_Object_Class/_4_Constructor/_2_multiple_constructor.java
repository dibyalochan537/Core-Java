package _3_Object_Class._4_Constructor;

public class _2_multiple_constructor {
    public _2_multiple_constructor(int x){
        System.out.println("i am empty");
    }
    public _2_multiple_constructor(){
        System.out.println("i am empty");
    }
    public static void main(String[] args) {
        _2_multiple_constructor obj=new _2_multiple_constructor(45);
        _2_multiple_constructor obj2=obj;
        System.out.println(obj.getClass().getName());
        System.out.println(obj2.getClass().getName());

    }
}
