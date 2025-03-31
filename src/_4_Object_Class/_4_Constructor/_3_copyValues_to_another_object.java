package _3_Object_Class._4_Constructor;

public class _3_copyValues_to_another_object {
    int x;
    int y;
    public static void main(String[] args) {
        //copy using assign object
        _3_copyValues_to_another_object obj1=new _3_copyValues_to_another_object();
        obj1.x=98;
        _3_copyValues_to_another_object obj2=obj1;
        System.out.println(obj2.x);
        System.out.println(obj1);
        System.out.println(obj2);
        obj1.y=998568;
        System.out.println(obj2.y);
    }
}
