package _3_Control_Statement._2_Loops._3_Do_While;

import java.util.Scanner;

public class _1_ATM_PIN {
    public static void main(String[] args) {
        int myAtmPin=9357;
        Scanner sc=new Scanner(System.in);
        int enterPin;
        do {
           enterPin=sc.nextInt();
           if(myAtmPin==enterPin){
               System.out.println("Login");
               break;
           }
           else{
               continue;
           }
        }while(myAtmPin!=enterPin);
        sc.close();
    }
}
