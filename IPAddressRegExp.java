/**
 * Created by dxs13 on 3/17/2016.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *  Problem statement at: https://www.hackerrank.com/challenges/java-regex
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IPAddressRegExp
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
    static class myRegex
    {
        /*String pattern = "^0?[0-9]{0,2}\\.0?[0-9]{0,2}\\.0?[0-9]{0,2}\\.0?[0-9]{0,2}$|" +
                "^1?[0-9]{0,2}\\.1?[0-9]{0,2}\\.1?[0-9]{0,2}\\.1?[0-9]{0,2}$|" +
                "^2?[0-5]{0,2}\\.2?[0-5]{0,2}\\.2?[0-5]{0,2}\\.2?[0-5]{0,2}$";*/

        String pattern = "^(0?[0-9]{0,2}|1[0-9]{0,2}|2[0-5]{0,2})\\.(0?[0-9]{0,2}|1[0-9]{0,2}|2[0-5]{0,2})\\.(0?[0-9]{0,2}|1[0-9]{0,2}|2[0-5]{0,2})\\.(0?[0-9]{0,2}|1[0-9]{0,2}|2[0-5]{0,2})$";
        /*
        000.12.12.034
        121.234.12.12
        23.45.12.56
        000.12.234.23.23
        666.666.23.23
        .213.123.23.32
        23.45.22.32.
        I.Am.not.an.ip

        true
        true
        false
        true
        false
        false
        false
        true
        true
        false
        false
        false
        12.12.12.12
        13.13.13.112
        VUUT.12.12
        111.111.11.111
        1.1.1.1.1.1.1
        .....
        1...1..1..1
        0.0.0.0
        255.0.255.0
        266.266.266.266
        00000.000000.0000000.00001
        0023.0012.0012.0034
         */
    }
}

