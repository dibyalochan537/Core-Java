package _1_basics;

public class _1_first_program {
    public static void main(String []args){
        System.out.print("Hello World");
        if(args.length==0){
            System.out.println("No argument pass");
        }
        else{
            int length=args.length;
            System.out.println("Length of args is : "+length);
            for(int i=0;i<args.length;i++){
                System.out.println("Arg "+i+" is "+args[i]);
            }
        }
    }
}
