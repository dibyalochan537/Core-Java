package _12_Collection._1_List._1_ArrayList;

import java.util.ArrayList;

public class _3_get_and_set {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //Before set we need to add() first
        System.out.println(list);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.set(0,"Raju");
        list.set(1,"Dash");
        list.set(2,"Raju-1");
        list.set(3,"Dash-1");
        //Get()
        for(int i=0;i<list.size();i++){
            String temp=list.get(i);
            System.out.print(temp+"      ");
        }
    }
}
