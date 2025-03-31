package _3_Object_Class._6_this;

public class _2_calling_constructor_in_same_class{
    int year;
    _2_calling_constructor_in_same_class(){
        this(2002);
    }
    _2_calling_constructor_in_same_class(int value){
        this.year=value;
    }
    public void display(){
        System.out.println(this.year);
    }
    public static void main(String[] args) {
        _2_calling_constructor_in_same_class obj=new _2_calling_constructor_in_same_class();
        obj.display();
    }
}
