package _1_basics;

public class _2_variable {
    //instance variable
    int a=5;
    //static variable
    static int b=6;
    public void prime(){
        System.out.println(a);
    }
    public static void main(String []args){
        //local variable
        int c;
        _2_variable obj=new _2_variable();
        _2_variable obj2=new _2_variable();
        obj.b=90;
        System.out.println(obj2.b);
    }
}
