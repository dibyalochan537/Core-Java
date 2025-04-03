package _11_Exception_Handling._2_Try_Catch_Block;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1_checked_exception {
    public void readFile(String fileName)throws FileNotFoundException{
        File file=new File(fileName);
        Scanner sc=new Scanner(file);
    }
    public static void main(String[] args) {
        _1_checked_exception obj=new _1_checked_exception();
        try {
            obj.readFile("abc.txt");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
