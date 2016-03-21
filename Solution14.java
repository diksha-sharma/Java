/**
 * Created by dxs13 on 3/17/2016.
 */
/* Problem Statement
Find the contiguous sub array within an array (containing at least one number) which has the largest sum.
For example:
Given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous sub array [4,-1,2,1] has the largest sum = 6.
For this problem, return the maximum sum
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution14
{
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(163);
        l.add(277);
        l.add(475);
        l.add(480);
        l.add(420);
        int result = maxSubArray(l);
        System.out.println(result);
    }

    public static int maxSubArray(final List<Integer> a)
    {
        int sum = Integer.MIN_VALUE;
        int tempSum = 0;
        boolean bPositive = false;
        boolean bNegative = false;
        if(a.size()==1)
        {
            return a.get(0);
        }
        else
        {
            for(int i=0; i< a.size(); i++)
            {
                if(a.get(i) < 0)
                {
                    bNegative = true;
                }
                else
                {
                    bNegative = false;
                    break;
                }
            }
            for(int i=0; i< a.size(); i++)
            {
                if(a.get(i) > 0)
                {
                    bPositive = true;
                }
                else
                {
                    bPositive = false;
                    break;
                }
            }
            if(bNegative == true)
            {
                for(int i=0; i< a.size(); i++)
                {
                    if(a.get(i) > sum)
                    {
                        sum = a.get(i);
                    }
                }
                return sum;
            }

            if(bPositive == true)
            {
                for(int i=0; i< a.size(); i++)
                {
                    if(a.get(i) > sum)
                    {
                        sum = a.get(i);
                    }
                }
                return sum;
            }
        }

        for(int size = 1; size < a.size(); size++)
        {
            for(int i=0; i< a.size(); i++)
            {
                tempSum = 0;
                for(int j=i; j<= size; j++)
                {
                    tempSum = a.get(j) + tempSum;
                }
                if(tempSum > sum)
                {
                    sum = tempSum;
                }
            }
        }
        return sum;
    }
}
