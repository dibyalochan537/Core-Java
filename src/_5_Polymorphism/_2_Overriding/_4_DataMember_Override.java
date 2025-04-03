package _5_Polymorphism._2_Overriding;

public class _4_DataMember_Override {
    int x=98;
    public void run(){
        System.out.println("Parent");
    }
}
class DataMember extends _4_DataMember_Override{
    double x=9545;
//    @Override
    public void run(){
        System.out.println("Child");
    }
}
class Main{
    public static void main(String[] args) {
        _4_DataMember_Override obj=new DataMember();
        obj.run();
    }
}
