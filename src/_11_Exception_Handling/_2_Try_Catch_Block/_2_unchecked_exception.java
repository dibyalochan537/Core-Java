package _11_Exception_Handling._2_Try_Catch_Block;

public class _2_unchecked_exception {
    public void arthimaticException()throws ArithmeticException{
        int x=100/0;
    }
    public static void main(String[] args) {
        _2_unchecked_exception obj=new _2_unchecked_exception();
        try{
            obj.arthimaticException();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
