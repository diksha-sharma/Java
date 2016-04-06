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

public class Solution22
{
    public static void main(String args[] ) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int iSize = sc.nextInt();
        if(iSize == 0)
        {
            System.out.println(0);
        }
        int[] iArr = new int[iSize];
        for(int i=0; i< iSize; i++)
        {
            iArr[i] = sc.nextInt();
        }

        Arrays.sort(iArr); //to find the smallest length stick

        int iCutSize = iArr[0];
        if(iCutSize == 0)
        {
            System.out.println(0);
        }
        int iCutsMade = 0;
        boolean bCutsMade = true;
        int iIndex = 0;
        while(bCutsMade == true)
        {
            Arrays.sort(iArr);
            while(iArr[iIndex] == 0 && iIndex < iArr.length-1)
            {
                iIndex++;
            }
            iCutSize = iArr[iIndex];
            bCutsMade = false;
            iCutsMade = 0;
            for(int i=0; i< iArr.length; i++)
            {
                if(iArr[i] > 0)
                {
                    iArr[i] = iArr[i] - iCutSize;
                    iCutsMade++;
                    bCutsMade = true;
                }
            }
            if(iCutsMade > 0)
            {
                System.out.println(iCutsMade);
            }
        }
    }
}
