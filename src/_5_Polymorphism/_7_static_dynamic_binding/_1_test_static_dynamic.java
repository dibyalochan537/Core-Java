package _5_Polymorphism._7_static_dynamic_binding;

public class _1_test_static_dynamic {
    void prime(){
        System.out.println("Parent prime");
    }
}
class _1_myTest extends _1_test_static_dynamic{
    @Override
    void prime(){
        System.out.println("Child prime");
    }

    public static void main(String[] args) {
        _1_test_static_dynamic obj=new _1_test_static_dynamic();
        obj.prime();
    }
}
