/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/tree-top-view
 */

class TreeTopView
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
    }
    public static Stack<Integer> st = new Stack<>();
    public static void top_view(Node root)
    {
        if(root.left != null)
        {
            st.push(root.data);
            top_view(root.left);
        }
        System.out.print(root.data + " ");
        if(!st.empty())
        {
            st.pop();
            return;
        }
        else
        {
            root = root.right;
            while(root.right != null)
            {
                System.out.print(root.data + " ");
                root = root.right;
            }
            System.out.print(root.data + " ");
        }
    }
}

