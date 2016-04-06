/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/duplicate-word
 */

class DuplicateWordsRegexp
{
    public static void main(String []args)
    {
        String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern r = Pattern.compile(pattern, Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find()){
                input = input.replaceAll(m.group(), m.group(1));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}

