package _3_Object_Class._4_Constructor;


class Vehicle{
    private String brand;
    private String model;
    private int year;
    //main constructor
    Vehicle(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    Vehicle(){
        this("","",0);
    }
}
class Car extends Vehicle{

}
public class _4_ChainingConstructor{
    public static void main(String[] args) {
        Vehicle obj=new Vehicle();
    }
}
