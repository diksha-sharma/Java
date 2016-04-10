/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/binary-search-tree-insertion
 */

class BinarySearchTreeInsertion
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
    }

    public static Node Insert(Node root,int value)
    {
        if(root.data == value)
        {
            return root;
        }
        else
        {
            if(value > root.data)
            {
                if(root.right != null)
                {
                    root.right = Insert(root.right, value);
                }
                else
                {
                    Node newNode = new Node();
                    newNode.data = value;
                    newNode.right = null;
                    newNode.left = null;
                    root.right = newNode;
                    return root;
                }
            }
            else
            {
                if(root.left != null)
                {
                    root.left = Insert(root.left, value);
                }
                else
                {
                    Node newNode = new Node();
                    newNode.data = value;
                    newNode.right = null;
                    newNode.left = null;
                    root.left = newNode;
                    return root;
                }
            }
        }
        return root;
    }
}

