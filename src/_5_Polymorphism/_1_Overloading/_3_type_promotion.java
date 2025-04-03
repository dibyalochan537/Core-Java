package _5_Polymorphism._1_Overloading;

public class _3_type_promotion {
    public static void apply(long a,int b){
        System.out.println("Int");
    }
    public static void apply(int a, long b){
        System.out.println("Float");
    }
//    private void x(){
//
//    }
//    public void x(){

//    }

    public static void main(String[] args) {
        apply((int)1,(long)1);
    }
}
