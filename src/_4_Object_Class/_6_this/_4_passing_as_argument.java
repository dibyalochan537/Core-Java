package _3_Object_Class._6_this;

public class _4_passing_as_argument {
    static int x;
    _4_passing_as_argument(int value){
        this.entry(value);
    }
    public void show(_4_passing_as_argument obj2,int y){
        System.out.println(obj2+""+y);
    }
    public void entry(int value){
        this.x=value;
        show(this,this.x);
    }
    public static void main(String[] args) {
        _4_passing_as_argument obj=new _4_passing_as_argument(78);
    }
}
