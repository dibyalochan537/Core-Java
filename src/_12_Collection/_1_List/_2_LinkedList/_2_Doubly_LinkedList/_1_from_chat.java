package _12_Collection._1_List._2_LinkedList._2_Doubly_LinkedList;

public class _1_from_chat {
    Node head;
    static class Node{
        int data;
        Node prev,next;
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
        newNode.prev=current;
    }
    public void printForward(){
        System.out.println("For Forward :-");
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void printBackward(){
        System.out.println("For Backward :-");
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.prev;
        }
    }
    public static void main(String[] args) {
        _1_from_chat list=new _1_from_chat();
        list.elementAdd(20);
        list.elementAdd(45);
        list.elementAdd(76);
        list.elementAdd(87);
        list.printForward();
        list.printBackward();
    }
}
