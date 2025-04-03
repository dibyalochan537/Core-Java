package _11_Exception_Handling._2_Try_Catch_Block;

public class _4_not_execute_after_exception {
    public void executeAfterException(int a,int b)throws ArithmeticException{
        a=a/b;
        System.out.println("I am after exception");
    }
    public static void main(String[] args) {
        _4_not_execute_after_exception obj=new _4_not_execute_after_exception();
        try{
            System.out.println("Before exception Occurs");
            obj.executeAfterException(10,0);
            System.out.println("After Exception code in same block");
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
