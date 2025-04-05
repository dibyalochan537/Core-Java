package _12_Collection._1_List._2_LinkedList._1_Singly_LinkedList;

public class _1_from_chatgpt {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void elementAdd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    // Display the list
    public void printList() {
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        _1_from_chatgpt list = new _1_from_chatgpt();
        list.elementAdd(10);
        list.elementAdd(20);
        list.elementAdd(30);
        list.printList();  // Output: 10 -> 20 -> 30 -> null
    }
}
