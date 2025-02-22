package _3_Control_Statement._2_Loops._1_For;

public class _1_for_loop {
    public static void main(String[] args) {
        int x=10;
        for(int i=0;i<100;i++){
            if(i>x){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
