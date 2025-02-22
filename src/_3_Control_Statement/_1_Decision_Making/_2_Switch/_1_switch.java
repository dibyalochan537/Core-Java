package _3_Control_Statement._1_Decision_Making._2_Switch;

public class _1_switch {
    public static void main(String[] args) {
        int x=10;
        switch (x){
            case 1:
            {
                System.out.println("i am 1");
                break;
            }
            case 5:{
                System.out.println("I am 5");
                break;
            }
            case 2:{
                System.out.println("I am two");
                break;
            }
            default:{
                System.out.println("Case no Match !!");
                break;
            }
        }
    }
}
