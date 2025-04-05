package _12_Collection._1_List._1_ArrayList;

import java.util.ArrayList;

public class _2_Generic_Non_Generic {
    public static void main(String[] args) {
        //Non-Generic(We can store different types data type)
        ArrayList obj=new ArrayList();
        obj.add("Raju");
        obj.add(34);
        obj.add("gfg");
        obj.add(56);
        System.out.println(obj);
        //Generic(We can store same types data type)
        ArrayList<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(76);
        list.add(45);
        list.add(76);
        System.out.println(list);
    }
}
