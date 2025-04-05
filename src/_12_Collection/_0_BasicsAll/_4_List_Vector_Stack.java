package _12_Collection._0_BasicsAll;

import java.util.List;
import java.util.Stack;
import java.util.Stack;

public class _4_List_Vector_Stack {
    public static void main(String[] args) {
        Stack<String> list=new Stack<>();
        list.push("1");
        list.push("2");
        list.push("3");
        list.push("4");
        System.out.println(list);
        System.out.println("Remove manually");
        list.pop();
        System.out.println(list);
    }
}
