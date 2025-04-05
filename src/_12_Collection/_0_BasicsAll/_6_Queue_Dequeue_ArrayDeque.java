package _12_Collection._0_BasicsAll;

import java.util.ArrayDeque;
import java.util.Deque;

public class _6_Queue_Dequeue_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(3);
        dq.add(3);
        dq.add(9);
        dq.add(7);
        System.out.println(dq);
    }
}
