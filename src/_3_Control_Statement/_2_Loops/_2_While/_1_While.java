package _3_Control_Statement._2_Loops._2_While;

import java.util.Scanner;

public class _1_While {
    public static void main(String[] args) {
        String userName="Raju";
        int password=9357;
        Scanner scanner = new Scanner(System.in);
        int enterPassword=9357;
        while (enterPassword!=password){
            enterPassword=scanner.nextInt();
            System.out.println("Login");
        }
    }
}
