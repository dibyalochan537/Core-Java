package _3_Object_Class._6_this;

public class _3_return_current_object {
    int x;
    public _3_return_current_object myMethod(){
        return this;
    }
//    public void mySecond(){
//        return this;
//    }
    public static void main(String[] args) {
        _3_return_current_object obj=new _3_return_current_object();
        System.out.println(obj);
        obj.x=653;
        System.out.println(obj.myMethod().x);
    }
}
