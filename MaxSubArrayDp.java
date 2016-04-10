/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/maxsubarray
 */

class MaxSubArrayDp
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();

        for(int i=0; i< iCases; i++)
        {
            int iSize = sc.nextInt();
            //Read the array elements
            int[] arr = new int[iSize];
            boolean positive = false;
            for(int j=0; j< iSize; j++)
            {
                arr[j] = sc.nextInt();
                if(arr[j] > 0)
                {
                    positive = true;
                }
            }

            System.out.println(getMaxSumSubArrayContiguous(arr, positive) + " " + getMaxSumSubArrayNonContiguous(arr, positive));
        }
    }

    public static int getMaxSumSubArrayContiguous(int[] arr, boolean flag)
    {
        if(flag == true)
        {
            int iAns = 0;
            int iB = 0;

            for(int j=0; j< arr.length; j++)
            {
                iB = Math.max(iB+arr[j], arr[j]);
                iAns = Math.max(iB, iAns);
            }
            return iAns;
        }
        else
        {
            int iAns = arr[0];
            int iB = arr[0];

            for(int j=0; j< arr.length; j++)
            {
                iB = Math.max(iB+arr[j], arr[j]);
                iAns = Math.max(iB, iAns);
            }
            return iAns;
        }
    }

    public static int getMaxSumSubArrayNonContiguous(int[] arr, boolean flag)
    {
        if(flag == true)
        {
            int iAns = 0;
            int iB = 0;

            for(int j=0; j< arr.length; j++)
            {
                if(arr[j] > 0)
                {
                    iB = Math.max(iB+arr[j], arr[j]);
                    iAns = Math.max(iB, iAns);
                }
            }
            return iAns;
        }
        else
        {
            int iAns = arr[0];
            int iB = arr[0];

            for(int j=0; j< arr.length; j++)
            {
                iB = Math.max(iB+arr[j], arr[j]);
                iAns = Math.max(iB, iAns);

            }
            return iAns;
        }
    }
}

