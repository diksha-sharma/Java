/**
 * Created by dxs13 on 3/17/2016.
 */
/* Problem Statement
Given a non-negative number represented as an array of digits,
add 1 to the number ( increment the number represented by the digits ).
The digits are stored such that the most significant digit is at the head of the list.
Example:
If the vector has [1, 2, 3]
the returned vector should be [1, 2, 4]
as 123 + 1 = 124.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(3);
        a.add(7);
        a.add(6);
        a.add(4);
        a.add(0);
        a.add(5);
        a.add(5);
        a.add(5);
        ArrayList<Integer> sum = plusOne(a);
        for(int i=0; i< sum.size(); i++)
        {
            System.out.println(sum.get(i));
        }
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> a)
    {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int iSum = 0;
        int iCarry = 0;
        iSum = a.get(a.size()-1) + 1;

        if(iSum > 9)
        {
            iCarry = iSum/10;
            iSum = iSum % 10;
            sum.add(iSum);
            for(int iIndex = a.size()-2; iIndex>= 0; iIndex--)
            {
                iSum = a.get(iIndex) + iCarry;
                if(iSum > 9)
                {
                    iCarry = iSum/10;
                    iSum = iSum % 10;
                    sum.add(0,iSum);
                }
                else
                {
                    iCarry = 0;
                    sum.add(0,iSum);
                }
            }
            if(iCarry > 0)
            {
                sum.add(0, iCarry);
            }
        }
        else
        {
            sum.add(iSum);
            for(int i=a.size()-2; i>=0; i--)
            {
                sum.add(0, a.get(i));
            }
        }

        while(sum.get(0) == 0)
        {
            sum.remove(0);
        }

        return sum;
    }
}
