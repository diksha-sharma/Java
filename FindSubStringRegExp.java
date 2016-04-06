/**
 * Created by dxs13 on 3/17/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement at: https://www.hackerrank.com/challenges/detect-html-tags
 */
public class FindSubStringRegExp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iSentences = sc.nextInt();
        String[] sentences = new String[iSentences];
        String line = sc.nextLine();
        String regExp = "\\b[a-zA-Z0-9_]*\\b";
        Pattern p = Pattern.compile(regExp);
        Matcher m;
        int j=0;
        for(int i=0; i< iSentences; i++)
        {
            line = sc.nextLine();
            sentences[i] = line;

        }
        int iSubStrings = sc.nextInt();
        String sSub = sc.nextLine();
        int count = 0;
        regExp = "\\B[a-zA-Z0-9_]*\\B";
        p = Pattern.compile(regExp);
        for(int i=0; i< iSubStrings; i++)
        {
            sSub = sc.nextLine();
            m =p.matcher(sSub);
            count = 0;
            for(int k=0; k< iSentences; k++)
            {
                count =0;
                while(m.find())
                {
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}