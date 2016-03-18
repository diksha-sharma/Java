/**
 * Created by dxs13 on 3/17/2016.
 */
/* Problem Statement
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
Read more details about roman numerals at Roman Numeric System
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution11
{
    public static void main(String[] args)
    {
        System.out.println(romanToInt("CD"));
    }

    public static int romanToInt(String a)
    {
        int iNum = 0;

        for(int i=0; i< a.length(); i++)
        {
            if (a.charAt(i) == 'I')
            {
                if(i+1 < a.length())
                {
                    if(a.charAt(i+1) == 'X' || a.charAt(i+1) == 'V')
                    {
                        //do nothing
                    }
                    else
                    {
                        iNum = iNum + 1;
                    }
                }
                else
                {
                    iNum = iNum + 1;
                }
            }
            else if (a.charAt(i) == 'V')
            {
                iNum = iNum + 5;
                if (i >= 1 && a.charAt(i - 1) == 'I')
                {
                    iNum = iNum - 1;
                }
            }
            else if (a.charAt(i) == 'X')
            {
                if(i+1 < a.length())
                {
                    if(a.charAt(i+1) == 'L' || a.charAt(i+1) == 'C')
                    {
                        //do nothing
                    }
                    else
                    {
                        iNum = iNum + 10;
                        if (i >= 1 && a.charAt(i - 1) == 'I')
                        {
                            iNum = iNum - 1;
                        }
                    }
                }
                else
                {
                    iNum = iNum + 10;
                    if (i >= 1 && a.charAt(i - 1) == 'I')
                    {
                        iNum = iNum - 1;
                    }
                }
            }
            else if (a.charAt(i) == 'L')
            {
                iNum = iNum + 50;
                if (i >= 1 && a.charAt(i - 1) == 'X')
                {
                    iNum = iNum - 10;
                }
            }
            else if (a.charAt(i) == 'C')
            {
                if(i+1 < a.length())
                {
                    if(a.charAt(i+1) == 'D' || a.charAt(i+1) == 'M')
                    {
                        //do nothing
                    }
                    else
                    {
                        iNum = iNum + 100;
                        if (i >= 1 && a.charAt(i - 1) == 'X')
                        {
                            iNum = iNum - 10;
                        }
                    }
                }
                else
                {
                    iNum = iNum + 100;
                    if (i >= 1 && a.charAt(i - 1) == 'X')
                    {
                        iNum = iNum - 10;
                    }
                }
            }
            else if (a.charAt(i) == 'D')
            {
                iNum = iNum + 500;
                if (i >= 1 && a.charAt(i - 1) == 'C')
                {
                    iNum = iNum - 100;
                }
            }
            else if (a.charAt(i) == 'M')
            {
                iNum = iNum + 1000;
                if (i >= 1 && a.charAt(i - 1) == 'C')
                {
                    iNum = iNum - 100;
                }
            }
        }
        return iNum;
    }
}
