package _4_Object_Class._2_object_and_class;

public class _4_anonymous_object {
    int x;
    public int sum(int a,int b){
        x=a+b;
        return x;
    }
    public void ret(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        _4_anonymous_object obj=new _4_anonymous_object();
        int y=new _4_anonymous_object().sum(12,78);
        System.out.println(y);
        new _4_anonymous_object().ret();
    }
}
