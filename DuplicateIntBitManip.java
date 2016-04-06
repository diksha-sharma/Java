import java.util.Scanner;

/**
 * Created by dxs13 on 4/5/2016.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/*
 *  Problem statement: https://www.hackerrank.com/challenges/lonely-integer
 */

public class DuplicateIntBitManip
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        //Arrays.sort(array);
        int duplicate = 0;
        for (int i = 0; i < array.length; i++) {
            duplicate = duplicate ^ array[i];
        }
        System.out.println(duplicate);
    }
}
