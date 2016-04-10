/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/coin-change
 */

class FunnyString
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        String s;
        s = sc.nextLine();
        for(int i=0; i< iCases; i++)
        {
            s = sc.nextLine();
            System.out.println(checkIfFunny(s));
        }
    }

    public static String checkIfFunny(String s)
    {
        //System.out.println(s);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        for(int i=1; i< s.length(); i++)
        {
            //System.out.println("s diff: " + Math.abs(s.charAt(i) - s.charAt(i-1)));
            //System.out.println("sb diff: " + Math.abs(sb.charAt(i) - sb.charAt(i-1)));
            if((Math.abs(s.charAt(i) - s.charAt(i-1))) !=  Math.abs(sb.charAt(i) - sb.charAt(i-1)))
            {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}

