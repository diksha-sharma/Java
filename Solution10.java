/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
You are given two strings, A and B. Find if there is a substring that appears in both A and B.
Input Format
Several test cases will be given to you in a single file. The first line of the input will contain
a single integer T, the number of test cases.
Then there will be T descriptions of the test cases. Each description contains two lines. The first
line contains the string A and the second line contains the string B.
Output Format
For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.
Constraints
All the strings contain only lowercase Latin letters.
1<=T<=10
1<=|A|,|B|<=10^5
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10
{
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        int iCases = myScan.nextInt();
        String A;
        String B;
        char[] cA;
        char[] cB;
        boolean bMatch = false;
        for(int i=0; i< iCases; i++)
        {
            A = myScan.next();
            B = myScan.next();
            cA = A.toCharArray();
            cB = B.toCharArray();
            Arrays.sort(cA);
            Arrays.sort(cB);
            bMatch = false;
            for(int a=0; a< cA.length; a++)
            {
                if(bMatch == false)
                {
                    for(int b=0; b < cB.length; b++)
                    {
                        if(cA[a] == cB[b])
                        {
                            System.out.println("YES");
                            bMatch = true;
                            break;
                        }
                    }
                }
                else
                {
                    break;
                }
            }
            if(bMatch == false)
            {
                System.out.println("NO");
            }
        }
    }
}