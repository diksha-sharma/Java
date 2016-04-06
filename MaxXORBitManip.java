/**
 * Created by dxs13 on 4/4/2016.
 */

import java.io.*;
import java.util.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/maximizing-xor
 */
public class MaxXORBitManip
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int result = 0;
        int min = Integer.MIN_VALUE;
        if(L<R)
        {
            for(int i=L; i<= R; i++)
            {
                for(int j=i; j<= R; j++)
                {
                    result = i^j;
                    if(result > min)
                    {
                        min = result;
                    }
                }
            }
        }
        else
        {
            for(int i=R; i<= L; i++)
            {
                for(int j=i; j<= L; j++)
                {
                    result = i^j;
                    if(result > min)
                    {
                        min = result;
                    }
                }
            }
        }
        System.out.println(min);
    }
}