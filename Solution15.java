/**
 * Created by dxs13 on 3/17/2016.
 */
/* Problem Statement
You’re given the pointer to the head node of a linked list, an integer to add to the list
and the position at which the integer must be inserted. Create a new node with the given
integer, insert this node at the desired position and return the head node. A position of 0
indicates head, a position of 1 indicates one node away from the head and so on. The head pointer
given may be null meaning that the initial list is empty.
Input Format
You have to complete the Node* Insert(Node* head, int data, int position) method which takes
 three arguments - the head of the linked list, the integer to insert and the position at which
 the integer must be inserted. You should NOT read any input from stdin/console. position will
 always be between 0 and the number of the elements in the list (inclusive).
Output Format
Insert the new node at the desired position and return the head of the updated linked list. Do
NOT print anything to stdout/console.
Sample Input
NULL, data = 3, position = 0
3 --> NULL, data = 4, position = 0
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution15
{
    public static void main(String[] args)
    {
        Node n = new Node();
        n.data = 3;
        n.next = null;
        Node head = new Node();
        head.data = 4;
        head.next = n;
        InsertNth(head, 5, 2);

    }

    /*Insert Node at a given position in a linked list
    head can be NULL
    First element in the linked list is at position 0
    Node is defined as below*/

    public static class Node
    {
        int data;
        Node next;
    }

    public static Node InsertNth(Node head, int data, int position)
    {
        Node headTemp = head;
        int iIndex = 0;
        Node prev = new Node();
        while (head.next != null)
        {
            iIndex++;
            if(iIndex == position)
            {
                Node n = new Node();
                n.data = data;

            }
        }

        return headTemp;
    }
}
