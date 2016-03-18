import java.util.ArrayList;
import java.util.StringTokenizer;

public class REVWROD 
{

	public static void main(String[] args) 
	{
		/*
		 * 
		 * Given an input string, reverse the string word by word.

			Example:
			
			Given s = "the sky is blue",
			
			return "blue is sky the".
			
			A sequence of non-space characters constitutes a word.
			Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
			If there are multiple spaces between words, reduce them to a single space in the reversed string.
		 * 
		 */
		
		String sInput = "the sky is blue";
		REVWROD rw = new REVWROD();
		String sOut = rw.reverseWords(sInput);
		System.out.println(sOut);

	}
	
	public String reverseWords(String a) 
	{
		
		String sReversed = "";
		
		StringTokenizer stTokenizer = new StringTokenizer(a);
		ArrayList<String> alOut = new ArrayList<String>();
		
		while(stTokenizer.hasMoreTokens())
		{
			
			alOut.add(stTokenizer.nextToken());
			
		}
		
		for(int i=(alOut.size()-1); i>=0; i--)
		{
			
			if(i> 0)
			{
				sReversed = sReversed + alOut.get(i) + " ";
				
			}
			else
			{
				sReversed = sReversed + alOut.get(i);
				
			}
					
		}
		
		return sReversed;
		
	}

}
