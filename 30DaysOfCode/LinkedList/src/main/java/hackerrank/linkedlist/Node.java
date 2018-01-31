package hackerrank.linkedlist;

public class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    public static Node insert(Node head,int data) {
        if(head==null)
            return new Node(data);

        Node temp=head;

        while(temp.next!=null)
            temp=temp.next;

        temp.next=new Node(data);
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

}
