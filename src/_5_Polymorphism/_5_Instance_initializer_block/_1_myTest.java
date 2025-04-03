package _5_Polymorphism._5_Instance_initializer_block;

public class _1_myTest {
    _1_myTest(){
        System.out.println("I am parent constructor");
    }
    {
        System.out.println("I am parent Instance initializer block");
    }
}
class myTest extends _1_myTest{
    myTest(){
        System.out.println("I am child Constructor");
    }
    {
        System.out.println("I am child Instance initializer block");
    }
    public static void main(String[] args) {
        myTest obj=new myTest();
    }
}
