/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/java-stack
 */

class StackOfBrackets
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        boolean mismatch = false;
        while (sc.hasNext())
        {
            String input=sc.next();
            Stack<Character> st = new Stack<Character>();
            mismatch = false;
            for(int i=0; i< input.length(); i++)
            {
                if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[')
                {
                    st.push(input.charAt(i));
                }
                else if(input.charAt(i) == ')')
                {
                    if(!st.isEmpty())
                    {
                        char out = st.pop();
                        if(out != '(')
                        {
                            //System.out.println(false);
                            mismatch = true;
                            break;
                        }
                    }
                    else
                    {
                        //System.out.println(false);
                        mismatch = true;
                        break;
                    }
                }
                else if(input.charAt(i) == '}')
                {
                    if(!st.isEmpty())
                    {
                        char out = st.pop();
                        if(out != '{')
                        {
                            //System.out.println(false);
                            mismatch = true;
                            break;
                        }
                    }
                    else
                    {
                        //System.out.println(false);
                        mismatch = true;
                        break;
                    }
                }
                else if(input.charAt(i) == ']')
                {
                    if(!st.isEmpty())
                    {
                        char out = st.pop();
                        if(out != '[')
                        {
                            //System.out.println(false);
                            mismatch = true;
                            break;
                        }
                    }
                    else
                    {
                        //System.out.println(false);
                        mismatch = true;
                        break;
                    }
                }
            }
            if(st.isEmpty() && mismatch == false)
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
    }
}

