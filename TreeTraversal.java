/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/tree-preorder-traversal
 */

class TreeTraversal
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
    }

    public static class Node
    {
        int data;
        Node left;
        Node right;
    }

    //3 5 2 1 4 6

    public void Preorder(Node root)
    {
        System.out.print(root.data + " ");
        if(root.left != null)
        {
            Preorder(root.left);
        }
        if(root.right != null)
        {
            Preorder(root.right);
        }
    }

    public void Postorder(Node root)
    {
        if(root.left != null)
        {
            Postorder(root.left);
        }
        if(root.right != null)
        {
            Postorder(root.right);
        }
        System.out.print(root.data + " ");
    }

    public void Inorder(Node root)
    {
        if(root.left != null)
        {
            Inorder(root.left);
        }
        System.out.print(root.data + " ");
        if(root.right != null)
        {
            Inorder(root.right);
        }
    }
}

