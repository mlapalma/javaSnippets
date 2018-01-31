package hackerrank.linkedlist;

import static hackerrank.linkedlist.Node.display;
import static hackerrank.linkedlist.Node.insert;
import java.util.Scanner;


public class Solution {

     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }

        display(head);
        sc.close();
    }


}
