/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/java-1d-array-easy
 */

class NegativeSumSubArrays
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        int isize = sc.nextInt();
        int[] arr = new int[isize];
        int count = 0;
        for(int i=0; i< isize; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] < 0)
            {
                count++;
            }
        }
        int size = 1;
        int tempsize = 0;
        for(int k=1; k< isize; k++)
        {
            size = k;
            //System.out.println("inside k loop");
            for(int i=0; i< isize-k; i++)
            {
                //System.out.println("inside i loop");
                ArrayList<Integer> temp = new ArrayList<Integer>();
                int  j= i;
                while(temp.size() <= size && j< isize)
                {
                    //System.out.println("inside while loop");
                    temp.add(arr[j]);
                    j++;
                }
                if(temp.size() == size)
                {
                    al.add(temp);
                }
                int sum  = 0;
                for(int l=0; l< temp.size(); l++)
                {
                    sum = sum + temp.get(l);
                }

                if(sum < 0)
                {
                    count++;
                }
                //System.out.println(temp.toString() + "  " + sum);
            }
        }

        System.out.println(count);
    }
}

