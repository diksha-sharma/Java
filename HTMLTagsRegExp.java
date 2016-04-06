import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
*  Problem statement at: https://www.hackerrank.com/challenges/detect-html-tags
*/

/**
 * Created by dxs13 on 4/2/2016.
 */
public class HTMLTagsRegExp
{
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int iCases = sc.nextInt();
        ArrayList<String> tags = new ArrayList<String>();
        String re = "<[a-z]+[0-9]*>|<[a-z]+[0-9]*/>|<[a-z]+[0-9]*";
        Pattern p = Pattern.compile(re);
        Matcher m;
        String line = sc.nextLine();
        String tag;
        for(int i=1; i<= iCases; i++)
        {
            line = sc.nextLine();
            m = p.matcher(line);
            while(m.find())
            {
                tag = m.group();
                tag = tag.replaceAll("<","");
                tag = tag.replaceAll(">","");
                tag = tag.replaceAll("/","");
                if(!tags.contains(tag))
                {
                    tags.add(tag);
                }
            }
        }

        Collections.sort(tags);
        for(int i=0; i< tags.size(); i++)
        {
            if(i< tags.size()-1)
            {
                System.out.print(tags.get(i)+";");
            }
            else
            {
                System.out.print(tags.get(i));
            }
        }
    }
}
