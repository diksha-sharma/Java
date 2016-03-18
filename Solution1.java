/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
Given an integer NN as input, check the following:
If NN is odd, print "Weird".
If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
If NN is even and N>20N>20, print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.
Input Format
There is a single line of input: integer NN.
Constraints
1≤N≤1001≤N≤100
Output Format
Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.
 */
import java.util.*;

public class Solution1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iN = sc.nextInt();

        if(iN % 2 == 1)
        {
            //If NN is odd, print "Weird".
            System.out.print("Weird");
        }
        else
        {
            if(iN >= 2 && iN <= 5)
            {
                //If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
                System.out.print("Not Weird");
            }
            if(iN >= 6 && iN <= 20)
            {
                //If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
                System.out.print("Weird");
            }
            else if(iN >= 20)
            {
                //If NN is even and N>20N>20, print "Not Weird".
                System.out.print("Not Weird");
            }
        }
    }

}