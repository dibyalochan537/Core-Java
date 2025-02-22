package _3_Control_Statement._1_Decision_Making._2_Switch;

public class _3_wrapper_class {
    static void checkType(int x){
        System.out.println(((Object)x).getClass().getSimpleName());
    }
    public static void main(String[] args) {
        Integer num=89;
        int value=78;
        System.out.println("Num : "+num.getClass().getSimpleName());
        checkType(value);
    }
}
