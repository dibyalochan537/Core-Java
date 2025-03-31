package _3_Object_Class._7_Super_Keyword;

public class _2_accessing_parent_class_method{
    public void getParent(){
        System.out.println("I am parent");
    }
}
class childClass2 extends _2_accessing_parent_class_method{
    void show(){
        super.getParent();
    }
    public static void main(String[] args) {
        childClass2 obj=new childClass2();
        obj.show();
    }
}
