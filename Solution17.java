import java.util.Scanner;

/**
 * Created by dxs13 on 3/19/2016.
 */

/*
Larry has a permutation of NN numbers, AA, whose unique elements range from 11 to NN (i.e.: A={a1,a2,…,aN−1,aN}A={a1,a2,…,aN−1,aN}). He wants AA to be sorted, so he delegates the task of doing so to his robot. The robot can perform the following operation as many times as it wants:

Choose any 33 consecutive indices and rotate their elements in such a way that ABCABC rotates to BCABCA, which rotates to CABCAB, which rotates back to ABCABC.
For example: if A={1,6,5,2,4,3}A={1,6,5,2,4,3} and the robot rotates (6,5,2)(6,5,2), AA becomes {1,5, 2, 6,4,3}{1,5, 2, 6,4,3}.

On a new line for each test case, print YESYES if the robot can fully sort AA; otherwise, print NONO.

Input Format

The first line contains an integer, TT, the number of test cases.
The 2T2T subsequent lines each describe a test case over 22 lines:

An integer, NN, denoting the size of AA.
NN space-separated integers describing AA, where the ithith value describes element aiai.
Constraints

1≤T≤101≤T≤10
3≤N≤10003≤N≤1000
1≤ai≤N, where every element ai is unique.1≤ai≤N, where every element ai is unique.
Output Format

On a new line for each test case, print YESYES if the robot can fully sort AA; otherwise, print NONO.

Sample Input

3
3
3 1 2
4
1 3 4 2
5
1 2 3 5 4
Sample Output

YES
YES
NO
Explanation

In the explanation below, the subscript of AA denotes the number of operations performed.

Test Case 0:
A0={3,1,2}→rotate(3,1,2)→A1={1,2,3}A0={3,1,2}→rotate(3,1,2)→A1={1,2,3}
AA is now sorted, so we print YESYES on a new line.

Test Case 1:
A0={1,3,4,2}→rotate(3,4,2)→A1={1,4,2,3}A0={1,3,4,2}→rotate(3,4,2)→A1={1,4,2,3}.
A1={1,4,2,3}→rotate(4,2,3)→A2={1,2,3,4}A1={1,4,2,3}→rotate(4,2,3)→A2={1,2,3,4}.
AA is now sorted, so we print YESYES on a new line.

Test Case 2:
No sequence of rotations will result in a sorted AA. Thus, we print NONO on a new line.
 */
public class Solution17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        int iSize = 0;
        int[] a;
        boolean bSorted = true;
        int iIndex  = -1;
        for(int i=0; i< iCases; i++)
        {
            iSize = sc.nextInt();
            a = new int[iSize];
            for(int j=0; j< iSize; j++)
            {
                a[j] = sc.nextInt();
            }

            for(int j=0; j< iSize-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    bSorted = false;
                    iIndex = j;
                    break;
                }
            }
            int temp =0;
            if(bSorted == false)
            {
                if(iSize == 3)
                {
                    for(int l=0; l< iSize; l++)
                    {
                        temp = a[2];
                        a[2] = a[1];
                        a[1] = a[0];
                        a[0] = temp;
                        bSorted = true;
                        for(int m=0; m< iSize-1; m++)
                        {
                            if (a[m] > a[m + 1])
                            {
                                bSorted = false;
                                break;
                            }
                        }
                        if(bSorted == true)
                        {
                            System.out.println("YES");
                        }
                        else
                        {
                            temp = a[2];
                            a[2] = a[1];
                            a[1] = a[0];
                            a[0] = temp;
                            bSorted = true;
                            for(int n=0; n< iSize-1; n++)
                            {
                                if (a[n] > a[n + 1])
                                {
                                    bSorted = false;
                                    break;
                                }
                            }
                            if(bSorted == true)
                            {
                                System.out.println("YES");
                                break;
                            }
                            else
                            {
                                System.out.println("NO");
                                break;
                            }
                        }
                    }
                }
                else
                {
                    int[] temparr = rotateArray(a, iIndex-1);
                    int t =0;
                    for(int p=iIndex-1; p < iIndex+2; p++)
                    {
                        //System.out.println("p: " +p);
                        a[p] = temparr[t];
                        //System.out.println("new array: " + a[p]);
                        t++;
                    }
                    bSorted = true;
                    for(int h=0; h< a.length-1; h++)
                    {
                        if (a[h] > a[h + 1])
                        {
                            //System.out.println("Comparing array: " + a[h]);
                            //System.out.println("to: " + a[h+1]);
                            bSorted = false;
                            break;
                        }
                    }
                    //System.out.println("bSorted: " + bSorted);
                    if(bSorted == true)
                    {
                        System.out.println("YES");
                        //break;
                    }
                    else
                    {
                        System.out.println("NO");
                        //break;
                    }
                }
            }
            else
            {
                System.out.println("YES");
            }
        }
    }

    public static int[] rotateArray(int[] b, int iIndex)
    {
        int temp = 0;
        int iSize = 3;
        int[] c = new int[3];
        int iTempIndex = iIndex;
        for(int i = 0; i< 3; i++)
        {
            c[i] = b[iTempIndex];
            iTempIndex++;
            //System.out.println("c[i]:  " + c[i]);
        }
        boolean bSorted = true;
        for(int l=0; l< 3; l++)
        {
            //System.out.println("c[l]:  " +c[l]);
            temp = c[2];
            c[2] = c[1];
            c[1] = c[0];
            c[0] = temp;
            bSorted = true;
            for(int m=0; m < iSize-1; m++)
            {
                //System.out.println("c[m]:  " +c[m]);
                if (c[m] > c[m + 1])
                {
                    //System.out.println("Not sorted yet:  ");
                    bSorted = false;
                    break;
                }
            }
            if(bSorted == true)
            {
                return c;
            }
            else
            {
                temp = c[2];
                c[2] = c[1];
                c[1] = c[0];
                c[0] = temp;
                bSorted = true;
                for(int n=0; n< iSize-1; n++)
                {
                    if (c[n] > c[n + 1])
                    {
                        //System.out.println("third rotation Not sorted yet:  ");
                        bSorted = false;
                        break;
                    }
                }
                if(bSorted == true)
                {
                    return c;
                }
                else
                {
                    return c;
                }
            }
        }
        return c;
    }
}

