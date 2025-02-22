package _3_Control_Statement._2_Loops._1_For;

import java.util.Scanner;

public class _3_factorial {
    public static void main(String[] args) {
        int number,factorial=1;
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}
