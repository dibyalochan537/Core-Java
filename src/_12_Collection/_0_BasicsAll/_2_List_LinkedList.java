package _12_Collection._0_BasicsAll;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _2_List_LinkedList {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Use manual add in postion");
        list.add(2,"New ");
        System.out.println(list);
        list.remove("First");
        list.remove(1);
        System.out.println(list);
    }
}
