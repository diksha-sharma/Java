/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/coin-change
 */

class CoinCount
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int iAmt = sc.nextInt();
        int iCurrTypes = sc.nextInt();
        int[] curr = new int[iCurrTypes];
        for(int i=0; i< iCurrTypes; i++)
        {
            curr[i] = sc.nextInt();
        }

        Arrays.sort(curr);
        System.out.println(findCount(curr, iAmt));
    }

    public static int findCount(int[] curr, int iAmt)
    {
        if(iAmt < curr[0])
        {
            //System.out.println("Returning 0: " + 0);
            return 0;
        }
        else if (iAmt == curr[0])
        {
            //System.out.println("Returning 1: " + 1);
            return 1;
        }
        else
        {
            int iSum  = findCount(curr, iAmt-curr[0]) + findCount(curr, curr[0]);
            System.out.println("Returning sum: " + iSum);
            return iSum;
        }
    }
}

