package _5_Polymorphism._2_Overriding;

public class _2_myOverride {
    static int price=98;
    public static int salary(){
       return price;
    }
}
class childClass extends _2_myOverride{
    public static int salary(){
        return price;
    }

    public static void main(String[] args) {
        childClass obj=new childClass();
        System.out.println(obj.salary());
    }
}
