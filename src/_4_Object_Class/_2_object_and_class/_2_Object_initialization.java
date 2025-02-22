package _4_Object_Class._2_object_and_class;

public class _2_Object_initialization {
    int x,y;
    public static void main(String[] args) {
        _2_Object_initialization obj1=new _2_Object_initialization();
        _2_Object_initialization obj2=new _2_Object_initialization();
        obj1.x=67;
        System.out.println(obj2.x);
        initializingUsingConstructor obj=new initializingUsingConstructor(20);
        System.out.println("Value of myX is :"+obj.myX);
    }
}
class initializingUsingConstructor{
    int myX;
    public initializingUsingConstructor(int value){
        this.myX=value;
    }
}
