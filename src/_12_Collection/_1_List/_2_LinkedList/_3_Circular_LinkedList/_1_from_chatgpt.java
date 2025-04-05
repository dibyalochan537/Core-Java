package _12_Collection._1_List._2_LinkedList._3_Circular_LinkedList;

public class _1_from_chatgpt {
    Node head,tail;
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
            tail=newNode;
            tail.next=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    public void display(){
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args) {
        _1_from_chatgpt list=new _1_from_chatgpt();
        list.elementAdd(87);
        list.elementAdd(98);
        list.elementAdd(2);
        list.elementAdd(1);
        list.display();
    }
}
