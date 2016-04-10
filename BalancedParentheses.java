/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/balanced-parentheses
 */

public class BalancedParentheses
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        sc.nextLine();
        String s;
        boolean bMatched = true;
        for(int i=0; i< iCases; i++)
        {
            Stack<String> st = new Stack<>();
            s = sc.nextLine();
            bMatched = true;
            for(int j=0; j< s.length(); j++)
            {
                if(s.charAt(j) == '{' || s.charAt(j) == '(' || s.charAt(j) == '[')
                {
                    st.push(String.valueOf(s.charAt(j)));
                }
                else if(s.charAt(j) == '}')
                {
                    if(!st.isEmpty())
                    {
                        String sPop = st.pop();
                        if(!sPop.equals("{"))
                        {
                            System.out.println("NO");
                            bMatched = false;
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("NO");
                        bMatched = false;
                        break;
                    }
                }
                else if(s.charAt(j) == ')')
                {
                    if(!st.isEmpty())
                    {
                        String sPop = st.pop();
                        if(!sPop.equals("("))
                        {
                            System.out.println("NO");
                            bMatched = false;
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("NO");
                        bMatched = false;
                        break;
                    }
                }
                else if(s.charAt(j) == ']')
                {
                    if(!st.isEmpty())
                    {
                        String sPop = st.pop();
                        if(!sPop.equals("["))
                        {
                            System.out.println("NO");
                            bMatched = false;
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("NO");
                        bMatched = false;
                        break;
                    }
                }
            }
            if(bMatched == true && st.isEmpty())
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}

