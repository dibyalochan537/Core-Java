package _12_Collection._1_List._1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class _4_Sort {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("V");
        list.add("Z");
        list.add("E");
        list.add("A");
        System.out.println(list);
        System.out.println("After sorting :-");
        Collections.sort(list);
        System.out.println(list);
    }
}
