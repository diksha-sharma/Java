/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/pattern-syntax-checker
 */

class PatternSyntaxChecker
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0)
        {
            String pattern = in.nextLine();
            try
            {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

