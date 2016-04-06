/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/java-string-reverse
 */

class Pallindrome
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean pallindrome = true;
        if(A.length()%2 ==0)
        {
            for(int i=0; i<= A.length()/2; i++)
            {
                if(A.charAt(i) != A.charAt(A.length()-1-i))
                {
                    pallindrome = false;
                    break;
                }
            }
        }
        else
        {
            for(int i=0; i<= A.length()/2-1; i++)
            {
                if(A.charAt(i) != A.charAt(A.length()-1-i))
                {
                    pallindrome = false;
                    break;
                }
            }
        }
        if(pallindrome == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

