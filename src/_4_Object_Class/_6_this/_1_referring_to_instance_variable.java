package _3_Object_Class._6_this;

public class _1_referring_to_instance_variable {
    int instance;
    _1_referring_to_instance_variable(int value){
        this.instance=value;
    }
    public static void display(){
//        System.out.println("Value of instance is : "+this.instance);
    }
    public static void main(String[] args) {
        _1_referring_to_instance_variable obj=new _1_referring_to_instance_variable(25);
        obj.display();
    }
}
