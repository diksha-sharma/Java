/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/fibonacci-modified
 */

class FibonacciModifiedAndFibonacci
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        BigInteger iA = sc.nextBigInteger();
        BigInteger iB = sc.nextBigInteger();
        int iN = sc.nextInt();
        /*BigInteger[] bi = new BigInteger[iN];
        bi[0] = iA;
        bi[1] = iB;
        for(int i=2; i< iN; i++)
        {
            bi[i] = bi[i-1].multiply(bi[i-1]).add(bi[i-2]);
        }
        System.out.println(bi[iN-1]);*/

        //System.out.println(Fibonacci(iN));
        System.out.println(FibonacciModified(iA, iB, iN));
    }

    public static int Fibonacci(int iN)
    {
        if(iN == 0)
        {
            return 0;
        }
        if(iN == 1)
        {
            return 1;
        }
        else
        {
            return Fibonacci(iN-1) + Fibonacci(iN-2);
        }
    }

    public static BigInteger FibonacciModified(BigInteger iA, BigInteger iB, int iN)
    {
        if(iN == 1)
        {
            return iA;
        }
        if(iN == 2)
        {
            return iB;
        }
        else
        {
            return FibonacciModified(iA, iB, iN-1).multiply(FibonacciModified(iA, iB, iN-1)).add(FibonacciModified(iA, iB,iN-2));
        }
    }
}

