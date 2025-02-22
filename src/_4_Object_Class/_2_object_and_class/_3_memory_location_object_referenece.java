package _4_Object_Class._2_object_and_class;

public class _3_memory_location_object_referenece {
    public static void main(String[] args) {
        _3_memory_location_object_referenece ob1=new _3_memory_location_object_referenece();
        _3_memory_location_object_referenece ob2=new _3_memory_location_object_referenece();
        System.out.println(new _3_memory_location_object_referenece());
        System.out.println(ob1+"   \n"+ob2);
        System.out.println(System.identityHashCode(ob1));
        System.out.println(System.identityHashCode(ob2));
    }
}
