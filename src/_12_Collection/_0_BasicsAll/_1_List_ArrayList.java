package _12_Collection._0_BasicsAll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1_List_ArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();
        //To Add
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(0);
        System.out.println(arrayList);
        //To remove
//        arrayList.removeAll(arrayList);
//        System.out.println(arrayList);
        //Iterable
        Iterator itr=arrayList.listIterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
//        arrayList.remove("First");
        System.out.println(arrayList);
    }

}
