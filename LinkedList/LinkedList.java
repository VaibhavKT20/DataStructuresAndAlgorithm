package LinkedList;

import java.util.Scanner;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertAtBeginning(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int newData){
        Node newNode= new Node(newData);
        //if Empty
        if(head==null){
            head=new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    public void insertAtPosition(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("PrevNode cannot be NULL!");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteNode(int position){
        if(head==null){
            return;

        }
        Node temp=head;
        //Delete at beginning
        if(position==0) {
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null&&i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null&&temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }



    public static void main(String[] args) {

        LinkedList obj=new LinkedList();
        Scanner sc=new Scanner(System.in);
        obj.insertAtBeginning(10);
        obj.insertAtEnd(20);
        System.out.println("Self defined linked list");
        obj.display();
        System.out.println("1. Insert at beginning");
        System.out.println("2. Insert at End");
        System.out.println("3. Insert at position");
        System.out.println("4. Display");
        System.out.println("5. Exit");

        while(true){
            System.out.print("Enter your choice: ");
            int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Enter element you want to insert at beginning: ");
                int elm1 = sc.nextInt();
                obj.insertAtBeginning(elm1);
                break;
            case 2:
                System.out.print("Enter element you want to insert at end: ");
                int elm2 = sc.nextInt();
                obj.insertAtEnd(elm2);
                break;
            case 3:
                System.out.print("Enter element you want to insert at any position: ");
                int elm3=sc.nextInt();
                obj.insertAtPosition(obj.head.next.next,elm3);
                break;
            case 4:
                obj.display();
                break;
            case 5:
                System.out.println("Enter the position you want to delete the node");
                int elm4=sc.nextInt();
                obj.deleteNode(elm4);
                System.out.println("Node deleted");
                break;
            case 6:System.exit(0);

        }
        }
    }
}
