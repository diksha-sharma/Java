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

class TreeHeight
{
    /*public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
    }*/

    public static class Node
    {
        int data;
        Node left;
        Node right;
    }

    public int height(Node root)
    {
        int heightleft = 0;
        int heightright = 0;
        int height = 0;
        if(root.left == null && root.right == null)
        {
            return 0;
        }
        else if(root.left != null || root.right != null)
        {
            height++;
            if(root.left != null)
            {
                heightleft = height(root.left);
            }
            if(root.right != null)
            {
                heightright = height(root.right);
            }
            height = height + Math.max(heightleft, heightright);
        }

        return height;
    }
}

