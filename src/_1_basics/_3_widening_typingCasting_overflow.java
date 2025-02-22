package _1_basics;

public class _3_widening_typingCasting_overflow {
    public static void main(String[] args) {
        //Widening
        int widening=19;
        float wideningValue=widening;
        System.out.println("Widening value is : "+wideningValue);

        //Typecasting
        float typecasting=19.5f;
        int typecastingValue=(int)typecasting;
        System.out.println("Typecasting value is v: "+typecastingValue);

        //Overflow
        int overflow=130;
        byte overflowValue=(byte)overflow;
        System.out.println("Overflow value is : "+overflowValue);
    }
}
