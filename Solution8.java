/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
Shashank likes strings in which consecutive characters are different.
For example, he likes ABABA, while he doesn't like ABAA. Given a string
containing characters A and B only, he wants to change it into a string
he likes. To do this, he is allowed to delete the characters in the string.
Your task is to find the minimum number of required deletions.
Input Format
The first line contains an integer T, i.e. the number of test cases.
The next T lines contain a string each.
Output Format
For each test case, print the minimum number of deletions required.
Constraints
1≤T≤10
1≤ length of string ≤10^5
 */
import java.util.*;
import java.io.*;
class Solution8
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int iTestCases = sc.nextInt();

        for(int i=0; i<iTestCases; i++)
        {
            String sInput = sc.next();
            int iDeletions = 0;
            for(int j=0; j< sInput.length()-1; j++)
            {
                if(sInput.charAt(j) == sInput.charAt(j+1))
                {
                    iDeletions++;
                }
            }
            System.out.println(iDeletions);
        }
    }
}
