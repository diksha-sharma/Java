public class COUNT_SAY 
{
	
	/*
	 * The count-and-say sequence is the sequence of integers beginning as follows:

		1, 11, 21, 1211, 111221, ...
		1 is read off as one 1 or 11.
		11 is read off as two 1s or 21.
		
		21 is read off as one 2, then one 1 or 1211.
		
		Given an integer n, generate the nth sequence.
		
		Note: The sequence of integers will be represented as a string.
		
		Example:
		
		if n = 2,
		the sequence is 11.
	 * 
	 */
	
	public static void main(String args[])
	{
		
		int n = 4;
		COUNT_SAY cs = new COUNT_SAY();
		
		String sResult = cs.countAndSay(n);
		System.out.println(sResult);
		
	}
	
	public String countAndSay(int a) 
	{
		String sResult = "1";
		String sLast = sResult;
		int count = 0;
		char cChar = '1';
		
		if (a < 3)
		{
			
			if (a == 1)
			{
				
				return "1";
			}
			else if (a == 2)
			{
				
				return "11";
				
			}
			
		}
		else
		{
			
			sLast = "11";
			char cLast;
			
			for(int i=3; i <= a; i++)
			{
				count = 1;
				sResult = "";
				cLast = sLast.charAt(sLast.length()-1);
				
				for(int j=0; j< sLast.length()-1; j++)
				{					
					if(sLast.charAt(j) == sLast.charAt(j+1))
					{
						
						count = count + 1;
						//System.out.println("New match count:  " + count);
						
					}
					else
					{
						
						sResult = sResult  + Integer.toString(count) + sLast.charAt(j);
						count = 1;
						//System.out.println("New result string:  " + sResult);
						//System.out.println("New non match count:  " + count);
						
					}
					
				}
				
				sResult = sResult  + Integer.toString(count) + cLast;
				sLast = sResult;
				//System.out.println("New sLast for next Iteration:  " + sLast);
				
			}
			
		}
		
		return sResult;
		
	}
	
}
