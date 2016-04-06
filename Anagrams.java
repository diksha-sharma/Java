/**
 * Created by dxs13 on 4/5/2016.
 */

import java.io.*;
import java.util.*;

/*
 *  Problem statement: https://www.hackerrank.com/challenges/java-anagrams
 */

class Anagrams
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }

    public static boolean isAnagram(String A, String B)
    {
        HashMap<Character, Integer> frequencyA = new HashMap<Character, Integer>();
        HashMap<Character, Integer> frequencyB = new HashMap<Character, Integer>();
        A= A.toLowerCase();
        B= B.toLowerCase();

        for(int i=0; i< A.length(); i++)
        {
            if(frequencyA.containsKey(A.charAt(i)))
            {
                int oldvalue = frequencyA.get(A.charAt(i)).intValue();
                int newvalue = oldvalue +1;
                frequencyA.replace(A.charAt(i),oldvalue, newvalue );
            }
            else
            {
                frequencyA.put(A.charAt(i),1);
            }
        }
        for(int i=0; i< B.length(); i++)
        {
            if(frequencyA.containsKey(B.charAt(i)))
            {
                if(frequencyB.containsKey(B.charAt(i)))
                {
                    int oldvalue = frequencyB.get(B.charAt(i)).intValue();
                    int newvalue = oldvalue +1;
                    frequencyB.replace(B.charAt(i),oldvalue, newvalue );
                }
                else
                {
                    frequencyB.put(B.charAt(i),1);
                }
            }
            else
            {
                return false;
            }
        }
        if(frequencyA.size() != frequencyB.size())
        {
            return false;
        }
        else
        {
            for(Character key: frequencyA.keySet())
            {
                int freqA = frequencyA.get(key).intValue();
                if(frequencyB.containsKey(key))
                {
                    int freqB = frequencyB.get(key).intValue();

                    if( freqA != freqB)
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}

