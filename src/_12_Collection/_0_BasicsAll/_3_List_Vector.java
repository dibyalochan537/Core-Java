package _12_Collection._0_BasicsAll;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class _3_List_Vector {
    public static void main(String[] args) {
        List<Integer> list=new Vector<>();
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(7);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Use manual add in postion");
        list.add(2,8);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
