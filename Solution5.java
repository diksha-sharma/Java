/**
 * Created by dxs13 on 3/15/2016.
 */
/* Problem Statement
"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating
system where no more data can be read from a data source." — (Wikipedia: End-of-file)
The challenge here is to read nn lines of input until you reach EOF, then number and print
all n lines of content.
Hint: Java's Scanner.hasNext() method is helpful for this problem.
Input Format
Read some unknown nn lines of input from stdin(System.in) until you reach EOF; each line
of input contains a non-empty String.
Sample Input
Hello world
I am a file
Read me until end-of-file.
Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
 */
import java.util.*;
import java.security.*;

public class Solution5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int iLine = 1;
        String line = "";
        while(sc.hasNext())
        {
            line = sc.nextLine();
            System.out.println(iLine + " " + line);
            iLine++;
        }
    }
}