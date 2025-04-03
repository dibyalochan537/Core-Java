package _11_Exception_Handling._2_Try_Catch_Block;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _3_different_type_exception_object_in_catch_block {
    public static void main(String[] args)throws FileNotFoundException {
        try{
            File file=new File("abc.txt");
            Scanner sc=new Scanner(file);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
//        catch(FileNotFoundException e){
//            System.out.println(e);
//            System.out.println("This catch block for file not found exception");
//        }
    }
}
