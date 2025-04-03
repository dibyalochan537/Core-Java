package _9_Oops_Misc._1_Object_Class;
//interface myInterface extends Object{
//    it show error
//}
public class _1_super_object_class extends Object{
    _1_super_object_class(){
        Object id=super.getClass();//It return class of Object
    }
    public static void main(String[] args) {
        _1_super_object_class obj=new _1_super_object_class();
    }
}
