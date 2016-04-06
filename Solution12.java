/**
 * Created by dxs13 on 3/17/2016.
 */
/* Problem Statement
Given an integer, convert it to a roman numeral, and return a string corresponding to
its roman numeral version
Input is guaranteed to be within the range from 1 to 3999.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution12
{
    public static void main(String[] args)
    {
        System.out.println(intToRoman(2000));
    }

    public static String intToRoman(int a)
    {
        String sNumber = "";
        if(a < 5)
        {
            if(a%4 == 0)
            {
                sNumber = "IV";
            }
            if(a%3 == 0)
            {
                sNumber = "III";
            }
            if(a%2 == 0 && a%4 != 0)
            {
                sNumber = "II";
            }
            else if(a==1)
            {
                sNumber = "I";
            }
        }
        else if(a == 5)
        {
            sNumber = "V";
        }
        else if(a > 5 && a < 10)
        {
            if(a%3 == 0)
            {
                if(a/3 == 2)
                {
                    sNumber = "VI";
                }
                else if (a/3 == 3)
                {
                    sNumber = "IX";
                }
            }
            if(a%4 == 0)
            {
                sNumber = "VIII";
            }
            if(a%7 == 0)
            {
                sNumber = "VII";
            }
        }
        else if(a == 10)
        {
            sNumber = "X";
        }
        else if(a > 10 && a < 50)
        {
            int j=0;
            if(a > 40)
            {
                j = a%40;
                sNumber = "XL" + intToRoman(j);
            }
            else if (a == 40)
            {
                sNumber = "XL";
            }
            else if(a > 30 && a < 40)
            {
                j = a % 30;
                sNumber = "XXX" + intToRoman(j);
            }
            else if (a == 30)
            {
                sNumber = "XXX";
            }
            else if(a > 20 && a < 30)
            {
                j = a % 20;
                sNumber = "XX" + intToRoman(j);
            }
            else if (a == 20)
            {
                sNumber = "XX";
            }
            else if(a > 10 && a < 20)
            {
                j = a % 10;
                sNumber = "X" + intToRoman(j);
            }
        }
        else if(a == 50)
        {
            sNumber = "L";
        }
        else if(a > 50 && a < 100)
        {
            int j = 0;
            if(a > 90)
            {
                j = a% 90;
                sNumber = "XC" + intToRoman(j);
            }
            else if(a ==90)
            {
                sNumber = "XC";
            }
            else if(a > 80 && a < 90)
            {
                j = a % 80;
                sNumber = "LXXX" + intToRoman(j);
            }
            else if(a == 80)
            {
                sNumber = "LXXX";
            }
            else if(a > 70 && a < 80)
            {
                j = a % 70;
                sNumber = "LXX" + intToRoman(j);
            }
            else if(a == 70)
            {
                sNumber = "LXX";
            }
            else if(a > 60 && a < 70)
            {
                j = a % 60;
                sNumber = "LX" + intToRoman(j);
            }
            else if(a == 60)
            {
                sNumber = "LX";
            }
            else if(a > 50 && a < 60)
            {
                j = a % 50;
                sNumber = "L" + intToRoman(j);
            }
        }
        else if(a == 100)
        {
            sNumber = "C";
        }
        else if(a > 100 && a < 500)
        {
            int j = 0;
            if(a > 400)
            {
                j = a% 400;
                sNumber = "CD" + intToRoman(j);
            }
            else if(a == 400)
            {
                sNumber = "CD";
            }
            else if(a > 300 && a < 400)
            {
                j = a % 300;
                sNumber = "CCC" + intToRoman(j);
            }
            else if(a == 300)
            {
                sNumber = "CCC";
            }
            else if(a > 200 && a < 300)
            {
                j = a % 200;
                sNumber = "CC" + intToRoman(j);
            }
            else if(a == 200)
            {
                sNumber = "CC";
            }
            else if(a > 100 && a < 200)
            {
                j = a % 100;
                sNumber = "C" + intToRoman(j);
            }
        }
        else if(a == 500)
        {
            sNumber = "D";
        }
        else if(a > 500 && a < 1000)
        {
            int j = 0;
            if(a > 900)
            {
                j = a% 900;
                sNumber = "CM" + intToRoman(j);
            }
            else if(a == 900)
            {
                sNumber = "CM";
            }
            else if(a > 800 && a < 900)
            {
                j = a% 800;
                sNumber = "DCCC" + intToRoman(j);
            }
            else if(a == 800)
            {
                sNumber = "DCCC";
            }
            else if(a > 700 && a < 800)
            {
                j = a% 700;
                sNumber = "DCC" + intToRoman(j);
            }
            else if(a == 700)
            {
                sNumber = "DCC";
            }
            else if(a > 600 && a < 700)
            {
                j = a% 600;
                sNumber = "DC" + intToRoman(j);
            }
            else if(a == 600)
            {
                sNumber = "DC";
            }
            else if(a > 500 && a < 600)
            {
                j = a % 500;
                sNumber = "D" + intToRoman(j);
            }
        }
        else if(a == 1000)
        {
            sNumber = "M";
        }
        else if(a > 1000 && a < 2000)
        {
            int i = a%1000;
            sNumber = "M" + intToRoman(i);
        }
        else if(a == 2000)
        {
            sNumber = "MM";
        }
        else if(a > 2000 && a < 3000)
        {
            int i = a%2000;
            sNumber = "MM" + intToRoman(i);
        }
        else if(a == 3000)
        {
            sNumber = "MMM";
        }
        else if(a > 3000 && a < 4000)
        {
            int i = a%3000;
            sNumber = "MMM" + intToRoman(i);
        }
        return sNumber;
    }
}
