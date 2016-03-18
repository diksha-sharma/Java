import java.math.BigInteger;
import java.util.ArrayList;

public class PLUS1 
{

	public static void main(String[] args) 
	{

	/*
	 * 
	 * Given a non-negative number represented as an array of digits,

		add 1 to the number ( increment the number represented by the digits ).
		
		The digits are stored such that the most significant digit is at the head of the list.
		
		Example:
		
		If the vector has [1, 2, 3]
		
		the returned vector should be [1, 2, 4]
		
		as 123 + 1 = 124.
		
		 NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
		For example, for this problem, following are some good questions to ask :
		Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
		A : For the purpose of this question, YES
		Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
		A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
		See Expected Output

	 * 
	 */
		
		PLUS1 p1 = new PLUS1();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(9);
		num.add(9);
		num.add(9);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = p1.plusOne(num);
		
		for(int i=0; i< result.size(); i++)
		{
			
			System.out.println(result.get(i));
			
		}	

	}
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) 
	{
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		String sNum = "";
		
		for(int i=0; i< a.size(); i++)
		{
			
			sNum = sNum + a.get(i);
		}
		
		//System.out.println(sNum);
		
		try
		{
			
			
			BigInteger bi = new BigInteger(sNum);
			
			bi = bi.add(BigInteger.ONE);
			
			sNum = bi.toString();
			
			for(int i= 0; i< sNum.length(); i++)
			{
				
				result.add((int)sNum.charAt(i)-48);
				
			}
			
			return result;
			
		}
		catch(Exception e)
		{
			
			return result;
			
		}
				
	}
	

}
