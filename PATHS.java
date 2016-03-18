import java.util.ArrayList;

public class PATHS 
{
	
	public static void main(String args[])
	{
		
		/*
		 * 
		 * A robot is located at the top-left corner of an A x B grid 
		 * (marked ‘Start’ in the diagram).
			The robot can only move either down or right at any point in time. 
			The robot is trying to reach the bottom-right corner of the grid 
			(marked ‘Finish’ in the diagram below).			
			How many possible unique paths are there?			
			Note: A and B will be such that the resulting answer fits in a 
			32 bit signed integer.
			
			Example :
			
			Input : A = 2, B = 2
			Output : 2
			
			2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
			              OR  : (0, 0) -> (1, 0) -> (1, 1)
		 * 
		 */
		
		PATHS paths = new PATHS();
		
		int iResult = paths.uniquePaths(3, 2);
		System.out.println(iResult);
		
	}
	
	public int uniquePaths(int a, int b)
	{
		
		if( a ==1 || b ==1)
		{
			return 1;
			
		}
		else
		{
			
			return  uniquePaths(a-1, b) + uniquePaths(a, b-1);
			
		}
		
	}
	

}
