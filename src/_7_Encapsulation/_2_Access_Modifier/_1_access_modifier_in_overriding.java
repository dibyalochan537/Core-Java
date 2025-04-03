package _7_Encapsulation._2_Access_Modifier;
class MyClass{
    protected void sum(){
        System.out.println(3+5);
    }
}
public class _1_access_modifier_in_overriding extends MyClass{
    @Override
    public void sum() {
        System.out.println(8+9);
    }
}
