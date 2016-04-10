/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/maximum-element
 */

public class MaxElementStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        sc.nextLine();
        String line = "";
        int iTemp = 0;
        ArrayList<Integer> max = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        String sOption = "";
        int iValue = 0;
        for(int i=0; i< iCases; i++)
        {
            line = sc.nextLine();
            //System.out.println("Line read: " + line);
            StringTokenizer token = new StringTokenizer(line);
            while(token.hasMoreTokens())
            {
                sOption = token.nextToken();
                //System.out.println("Option: " + sOption);
                if(sOption.equals("1"))
                {
                    iValue = Integer.parseInt(token.nextToken());
                    //System.out.println("Value: " + iValue);
                }
            }
            if(sOption.equals("1"))
            {
                if(st.isEmpty() && max.size() == 0)//first element
                {
                    max.add(iValue);
                    st.push(iValue);
                    //System.out.println("Added to max: " + iValue);
                    //System.out.println("Added to stack: " + iValue);
                }
                else if(max.size()> 0)
                {
                    if(max.get(max.size()-1) < iValue)
                    {
                        max.add(iValue);
                        st.push(iValue);
                        //System.out.println("Added to max: " + iValue);
                        //System.out.println("Added to stack: " + iValue);
                    }
                    else
                    {
                        st.push(iValue);
                        //System.out.println("Added to stack: " + iValue);
                    }
                }

            }
            else if(sOption.equals("2"))
            {
                if(!st.isEmpty())
                {
                    iTemp = st.pop();
                    //System.out.println("popped from stack: " + iValue);
                    if(max.get(max.size()-1) == iTemp)
                    {
                        max.remove(max.size()-1);
                        //System.out.println("Popped from max: " + iValue);
                    }
                }
            }
            else if(sOption.equals("3"))
            {
                if(max.size() > 0)
                {
                    System.out.println(max.get(max.size()-1));
                }
            }
        }
    }
}

