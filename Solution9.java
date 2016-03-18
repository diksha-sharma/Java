/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from
 Raven and plans to lock the single door through which the enemy can enter his kingdom.
But, to lock the door he needs a key that is an anagram of a certain palindrome string.
The king has a string composed of lowercase English letters. Help him figure out whether any anagram
of the string can be a palindrome or not.
Input Format
A single line which contains the input string.
Constraints
1≤ length of string ≤10^5
Each character of the string is a lowercase English letter.
Output Format
A single line which contains YES or NO in uppercase.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        int[] iArr = new int[26];
        int iUnique = 0;
        String ans = "YES";
        int iIndex = -1;
        for(int i=0; i< inputString.length(); i++)
        {
            iIndex = inputString.charAt(i) - 97;
            iArr[iIndex]++;
        }
        int iOddCount = 0;
        for(int i=0; i< 26; i++)
        {
            if(iArr[i] %2 != 0)
            {
                if(iOddCount == 1)
                {
                    ans = "NO";
                    break;
                }
                else
                {
                    iOddCount++;
                }
            }
        }

        System.out.println(ans);
        myScan.close();
    }
}
