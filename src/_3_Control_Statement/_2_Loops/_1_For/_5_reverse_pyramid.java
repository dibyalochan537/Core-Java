package _3_Control_Statement._2_Loops._1_For;

public class _5_reverse_pyramid {
    public static void main(String[] args) {
        int data=5;
        for(int i=0;i<data;i++){
            for(int j=0;j<data-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
