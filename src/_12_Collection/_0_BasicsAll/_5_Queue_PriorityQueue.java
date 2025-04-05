package _12_Collection._0_BasicsAll;

import java.util.PriorityQueue;
import java.util.Queue;

public class _5_Queue_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>();
        q1.add(5);
        q1.add(1);
        q1.add(9);
        q1.add(7);
        System.out.println(q1);
        System.out.println("After remove first two element :-");
        q1.remove();
        q1.poll();
        System.out.println(q1);
    }
}
