/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/valid-username-checker
 */

class UsernameChecker
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0)
        {
            String input = in.nextLine();
            String pattern = "^[a-zA-Z][a-zA-Z_]{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(input);
            if(m.find())
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

