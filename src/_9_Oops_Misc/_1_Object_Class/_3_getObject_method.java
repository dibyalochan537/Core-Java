package _9_Oops_Misc._1_Object_Class;

public class _3_getObject_method {
    public static _3_getObject_method getObject(){
        _3_getObject_method my=new _3_getObject_method();
        return my;
    }
    public static void main(String[] args) {
        Object obj=getObject();
        System.out.println(obj);
    }
}
