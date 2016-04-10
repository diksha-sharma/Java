/**
 * Created by dxs13 on 4/6/2016.
 */

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.*;

/*
 *  Problem statement:
 */

class LinkedLists
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        /*int data;
        int position;
        Node head = null;
        for(int i=0; i< cases; i++) {
            data = sc.nextInt();
            position = sc.nextInt();
            head = InsertNth(head, data, position);
            System.out.println(data);
        }*/

        /*List<Node> list = new LinkedList<Node>();
        Node n1 = new Node();
        Node n2 = new Node();
        Node head = new Node();
        n1.data = 1;
        n2.data = 2;
        n1.next = n2;
        list.add(n1);
        head = list.get(0);
        n1.data = 3;
        n2.next = n1;
        n1.next = null;
        list.add(n2);
        list.add(n1);
        head = Delete(head, 3);
        while(head.next!= null)
        {
            System.out.print(head.data);
            head = head.next;
        }*/
    }

    public static Node Reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node node = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static Node MergeLists(Node headA, Node headB)
    {
        if(headA != null && headB != null)
        {
            Node head = new Node();
            Node node = new Node();
            node = head;
            boolean firstNode = true;
            while(headA.next!= null && headB.next != null)
            {
                if(headA.data < headB.data)
                {
                    node.next = headA;
                    headA = headA.next;
                }
                else
                {
                    node.next = headB;
                    headB = headB.next;
                }
                node = node.next;
            }
            if(headA.next != null)
            {
                node.next = headA;
            }
            if(headB.next != null)
            {
                node.next = headB;
            }

            return head.next;
        }
        else if(headA != null && headB == null)
        {
            return headA;
        }
        else if(headB != null && headA == null)
        {
            return headB;
        }
        else
        {
            return null;
        }
    }

    public static void ReversePrint(Node head)
    {
        if(head != null)
        {
            ReversePrint(head.next);
            System.out.println(head.data);
        }
    }

    public static Node Delete(Node head, int position)
    {
        if(head != null)
        {
            int count = 0;
            Node n = new Node();
            n = head;
            while(count< position)
            {
                count++;
                n = n.next;
            }
            n.next = n.next.next;

            return head;
        }
        else
        {
            return null;
        }
    }

    public static Node InsertNth(Node head, int data, int position)
    {
        Node n = new Node();
        n.data = data;
        Node node = new Node();
        node = head;
        if(head != null)
        {
            int count = 0;
            if(position == 1)
            {
                head.next = n;
                n.next = null;
                return head;
            }
            else
            {
                while(count < position-1)
                {
                    count++;
                    //System.out.println("New Count:  " + count);
                    //System.out.println("Node data: " + node.data);
                    if(node.next!= null)
                    {
                        node = node.next;
                    }
                    else
                    {
                        Node newnode = new Node();
                        newnode.data = 0;
                        newnode.next = null;
                        node.next = newnode;
                        node = node.next;
                    }
                }
                if(node.next != null)
                {
                    n.next = null;
                }
                else
                {
                    n.next = node.next;
                }
                node.next = n;
                return head;
            }
        }
        else
        {
            n.next = null;
            return n;
        }
    }

    public static class Node
    {
        int data;
        Node next;
    }
}

