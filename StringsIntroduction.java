import java.io.*;
import java.util.*;
/**
 * Created by dxs13 on 4/5/2016.
 */
/*
 *  Problem statement: https://www.hackerrank.com/challenges/java-strings-introduction
 */
public class StringsIntroduction
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        if(!A.equals(null) && !B.equals(null))
        {
            System.out.println(A.length() + B.length());
            if(A.compareTo(B) > 0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            A = String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1, A.length());
            B = String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1, B.length());
            System.out.println(A + " " + B);
        }
        else
        {
            System.out.println(0);
            System.out.println("No");
        }
    }
}
