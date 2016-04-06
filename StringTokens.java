/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/java-string-token
 */

class StringTokens
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

        StringTokenizer st = new StringTokenizer(s, " !,?.\\_'@");
        ArrayList<String> tokens = new ArrayList<String>();
        int count =0;
        while(st.hasMoreTokens())
        {
            tokens.add(st.nextToken());
            count++;
        }
        System.out.println(count);
        for(int i=0; i< tokens.size(); i++)
        {
            System.out.println(tokens.get(i));
        }
    }
}

