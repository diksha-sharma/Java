/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
Given an integer, N, traverse its digits (d1,d2,...,dn) and determine how many digits evenly
divide N (i.e.: count the number of times N divided by each digit di has a remainder of 0).
Print the number of evenly divisible digits.
Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit
should be counted (i.e.: for N=111, the answer is 3).
Input Format
The first line is an integer, T, indicating the number of test cases.
The T subsequent lines each contain an integer, N.
Constraints
1≤T≤15
0<N<109
Output Format
For every test case, count and print (on a new line) the number of digits in N that are able to evenly divide N.
 */
import java.util.*;
import java.io.*;
class Solution7
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int iTestCases = sc.nextInt();

        for(int i=0; i<iTestCases; i++)
        {
            int iNum = sc.nextInt();
            String sNum = String.valueOf(iNum);
            int iCount = 0;
            for(int j=0; j< sNum.length(); j++)
            {
                int iDigit = Integer.parseInt(String.valueOf(sNum.charAt(j)));
                if(iDigit!=0)
                {
                    if(iNum%iDigit == 0)
                    {
                        iCount++;
                    }
                }
            }
            System.out.println(iCount);
        }
    }
}
