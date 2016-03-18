import java.math.BigInteger;

public class POWER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Find if Given number is power of 2 or not. 
			More specifically, find if given number can be expressed as 2^k where k >= 1.
			
			Input:
			
			number length can be more than 64, which mean number can be greater than 2 ^ 64 (out of long long range)
			Output:
			
			return 1 if the number if a power of 2 else return 0
			
			Example:
			
			Input : 128
			Output : 1
		* 
		 */
		
		POWER pw = new POWER();
		//int iResult = pw.power("21");
		//System.out.println(iResult);
		//iResult = pw.power("64");
		//System.out.println(iResult);
		//iResult = pw.power("49");
		//System.out.println(iResult);
		int iResult = pw.power("1");
		System.out.println(iResult);
	}
	
	public int power(String a) 
	{		
		try
		{
			BigInteger bi = new BigInteger(a);
			
			if(bi.equals(BigInteger.ONE))
			{
				
				return 0;
				
			}
			BigInteger bi2 = new BigInteger("0");
			bi2 = bi.and(bi.subtract(BigInteger.ONE));
			BigInteger bi3 = new BigInteger("0");		
			bi3 = bi.and(bi2);
									
			if (bi3.equals(BigInteger.ZERO))
			{
				
				return 1;
				
			}
			else
			{
				
				return 0;
				
			}
			
		}
		catch(Exception e)
		{
			
			return 0;
		}
				
	}

}
