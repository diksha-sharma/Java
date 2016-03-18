import java.util.ArrayList;
import java.util.Scanner;

public class LCP 
{

	public static void main(String[] args) 
	{
		
		LCP lcpObj = new LCP();
		
		// TODO Auto-generated method stub
		/*
		 * Write a function to find the longest common prefix string amongst an array of strings.
		 * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
		 * As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
		 * Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
		 * Example:
			Given the array as:
			[
			  "abcdefgh",
			  "aefghijk",
			  "abcefgh"
			]
			The answer would be “a”.
		 */
		
		ArrayList<String> alStrings = new ArrayList<String>();
		
		alStrings.add("abcdefgh");
		alStrings.add("aefghijk");
		alStrings.add("abcefgh");
		
		String sResult = lcpObj.longestCommonPrefix(alStrings);
		System.out.println("Longest Common Prefix: " + sResult);
		
	}
	
	
	public String longestCommonPrefix(ArrayList<String> a) 
	{
		String sCommon = "";
		
		//Check if any string is null - then that is the common prefix for all other strings
		for(int i=0; i< a.size(); i++)
		{
			
			if(a.get(i).equals(null))
			{
				
				return null;
			}
			
		}
		
		String sSmallest = "";
		int iIndexSmallest = -1;
		
		//None of the strings are null so find the smallest string out of all
		for(int i=0 ; i< a.size(); i++)	
		{
			
			if (i == 0)
			{
				
				sSmallest = a.get(0);
				iIndexSmallest = 0;
				
			}
			else
			{
				
				if(sSmallest.length() < a.get(i).length())
				{
					
					sSmallest = a.get(i);
					iIndexSmallest = i;
					
				}
				
			}
			
		}
		
		boolean bFound = true;
		//We have the smallest string - iteratively check for it to be prefix of other strings
		//starting with complete length and decreasing by 1 each time
		while(sSmallest.length() > 0)
		{
			//System.out.println("Finding prefix:  " + sSmallest);
			
			bFound = true;
			for(int i=0; i< a.size(); i++)
			{
				
				if(!a.get(i).startsWith(sSmallest))
				{
					
					bFound = false;
					
				}
				
			}
			
			if(bFound == false)
			{
				
				sSmallest = sSmallest.substring(0, sSmallest.length()-1);
				
			}
			else
			{
				
				sCommon = sSmallest;
				return sCommon;
			}
			
		}	
		
		return sCommon;
	}

}
