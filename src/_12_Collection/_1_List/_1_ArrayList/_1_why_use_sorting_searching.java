package _12_Collection._1_List._1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _1_why_use_sorting_searching {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            int random=(int)(Math.random()*10)+1;
            list.add(random);
        }
        System.out.println("List is : "+list);

        System.out.println("After sorted :-");
        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        System.out.println("Search an element from an list :-");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Element : ");
        int searchObject=sc.nextInt();
        if(list.contains(searchObject)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found !!");
        }
    }
}
