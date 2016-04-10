/**
 * Created by dxs13 on 4/9/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: InterviewQuestion
 */

class ConvertString
{
    public static void main(String args[])
    {
        String s = "international";
        System.out.println(convertString(s));
        s = "horse";
        System.out.println(convertString(s));
        s = "symbolic";
        System.out.println(convertString(s));
    }

    public static String convertString(String s)
    {
        int length = s.length()-2;
        return String.valueOf(s.charAt(0)) + length + String.valueOf(s.charAt(s.length()-1));
    }
}

