/**
 * Created by dxs13 on 3/17/2016.
 */
/* Problem Statement

 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution21
{
    public static void main(String args[] ) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int iSize = sc.nextInt();
        int[] iArr = new int[iSize];
        for(int i=0; i< iSize; i++)
        {
            iArr[i] = sc.nextInt();
        }

        String sOut = "";
        boolean bFoundMatch = false;
        for(int i=0; i< iArr.length; i++)
        {
            bFoundMatch = false;
            for(int j=0; j< i; j++)
            {
                if(iArr[j] == iArr[i])
                {
                    sOut = sOut + "1";
                    bFoundMatch = true;
                    break;
                }
            }
            if(bFoundMatch == false)
            {
                sOut = sOut + "0";
            }
        }
        System.out.println(sOut);

        sOut = "";
        bFoundMatch = false;
        for(int i=0; i< iArr.length; i++)
        {
            bFoundMatch = false;
            for(int j=iArr.length-1; j > i; j--)
            {
                if(iArr[j] == iArr[i])
                {
                    sOut = sOut + "1";
                    bFoundMatch = true;
                    break;
                }
            }
            if(bFoundMatch == false)
            {
                sOut = sOut + "0";
            }
        }
        System.out.println(sOut);
    }
}
