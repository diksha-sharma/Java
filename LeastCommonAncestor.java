/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor
 */

class LeastCommonAncestor
{
    public static ArrayList<Node> parent1 = new ArrayList<>();
    public static ArrayList<Node> parent2 = new ArrayList<>();
    public static boolean first = true;
    public static Node lca (Node root,int v1,int v2)
    {
        findParents(root, v1);
        first = false;
        findParents(root, v2);
        if(parent1.isEmpty() || parent2.isEmpty())
        {
            return root;
        }
        else
        {
            Collections.reverse(parent1);
            Collections.reverse(parent2);
            /*for(int i=0; i< parent1.size(); i++)
            {
                System.out.print(parent1.get(i).data + " ");
            }
            System.out.println();
            for(int i=0; i< parent2.size(); i++)
            {
                System.out.print(parent2.get(i).data + " ");
            }*/

            for(int i=0; i< parent1.size() ; i++)
            {
                if(parent2.contains(parent1.get(i)))
                {
                    return parent1.get(i);
                }
            }
        }
        return root;
    }
    public static void findParents(Node root,int v)
    {
        if(first == true)
        {
            if(v > root.data)
            {
                if(!parent1.contains(root))
                {
                    parent1.add(root);
                }
                findParents(root.right, v);
            }
            else if(v < root.data)
            {
                if(!parent1.contains(root))
                {
                    parent1.add(root);
                }
                findParents(root.left, v);
            }
            else
            {
                return;
            }
        }
        else
        {
            if(v > root.data)
            {
                if(!parent2.contains(root))
                {
                    parent2.add(root);
                }
                findParents(root.right, v);
            }
            else if(v < root.data)
            {
                if(!parent2.contains(root))
                {
                    parent2.add(root);
                }
                findParents(root.left, v);
            }
            else
            {
                return;
            }
        }
    }

    public class Node
    {
        int data;
        Node left;
        Node right;
    }

}

