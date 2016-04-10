/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: Interview Question
 *
 *  5
3, 2
2, 1
4, 2
5, 1
6, 5
1
 */

class CreateTree
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int iEdges = sc.nextInt();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        sc.nextLine();
        for(int i=0; i< iEdges; i++)
        {
            edges.add(processEdge(sc.nextLine()));
        }
        Node root = new Node(Integer.parseInt(sc.nextLine()));
        root = makeTree(edges, root);
    }

    public static Edge processEdge(String s)
    {
        StringTokenizer st = new StringTokenizer(s,",");
        Edge e = new Edge();
        Node parent;
        Node child;
        if(st.countTokens() == 2)
        {
            child = new Node(Integer.parseInt(st.nextToken().trim()));
            parent = new Node(Integer.parseInt(st.nextToken().trim()));
            e.parent = parent;
            e.child = child;
        }
        return e;
    }

    public static Node makeTree(ArrayList<Edge> edges, Node root)
    {
        ArrayList<Node> al = new ArrayList<Node>();
        for(Edge e: edges)
        {
            if(al.contains(e.parent))
            {
                al.get(al.indexOf(e.parent)).children.add(e.child);
                System.out.println("Added new child: " + e.child.data + " to parent: " + e.parent.data);
            }
            else
            {
                Node n = new Node(e.parent.data);
                n.children.add(e.child);
                al.add(n);
                System.out.println("Added child: " + e.child.data + " to parent added as a new node: " + e.parent.data);
            }
        }



        return root;
    }

    public static class Node
    {
        int data;
        ArrayList<Node> children;

        public Node(int name)
        {
            data = name;
            children = new ArrayList<Node>();
        }
    }

    public static class Edge
    {
        Node parent;
        Node child;
    }
}

