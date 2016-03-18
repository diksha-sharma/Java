
public class STRSTR 
{

	public static void main(String[] args) 
	{

		/*
		 * 
		 * Another question which belongs to the category of questions which are intentionally stated vaguely. 
			Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.
			
			Implement strStr().
			
			 strstr - locate a substring ( needle ) in a string ( haystack ). 
			Try not to use standard library string functions for this question.
			
			Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
			
			 NOTE: Good clarification questions:
			What should be the return value if the needle is empty?
			What if both haystack and needle are empty?
			For the purpose of this problem, assume that the return value should be -1 in both cases. 
		 * 
		 */
		
		STRSTR st = new STRSTR();
		int iResult = st.strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa");
		System.out.println(iResult);

	}

	public int strStr(final String haystack, final String needle) 
	{
		
		int iIndex = -1;
		int iMatchChar = 0;
		int j =0;
		
		if(haystack.length() > 1 && needle.length() < haystack.length())
		{
			
			for(int i=0; i< (haystack.length() - needle.length()); i++)
			{
				
				//System.out.println("Haystack char: " + haystack.charAt(i));
				//System.out.println("Needle char: " + needle.charAt(j));
				
				if(haystack.charAt(i) == needle.charAt(j))
				{
					iMatchChar = iMatchChar + 1;
					//System.out.println("Matched characters: " + iMatchChar);
					
				}
				else
				{
					//System.out.println("Match not found ");
					iMatchChar = 0;
					i = i-j;
					j = -1;				
					
				}
			
				if(iMatchChar == needle.length())
				{
					//System.out.println("Index: " + (i-iMatchChar));
					return (i-iMatchChar+1);
					
				}
				
				if(j < needle.length()-1)
				{
					j= j+1;
					
				}
				//System.out.println();
				
			}
			
		}
		else if (needle.length() > haystack.length())
		{
			
			return -1;
		}	
		else if(haystack.length() == 1 && needle.length() == 1)
		{
			
			if(haystack.charAt(0) == needle.charAt(0))
			{
				
				return 0;
				
			}
			else
			{
				
				return -1;
			}
			
		}
		
		return iIndex;
	}
	
}
