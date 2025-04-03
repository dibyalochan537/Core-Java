package _9_Oops_Misc._2_Object_Cloning;

public class _1_clone_exception implements Cloneable{
    int x=30;
    public static void main(String[] args) throws CloneNotSupportedException {
        _1_clone_exception obj=new _1_clone_exception();
        obj.x=56;
        try{
            _1_clone_exception obj2= (_1_clone_exception) obj.clone();
            System.out.println(obj2.x);
            obj.x=98;
            System.out.println(obj2.x);
            System.out.println(obj.x);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
