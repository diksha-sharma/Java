import java.util.ArrayList;

public class ARRANGE 
{

	public static void main(String[] args) 
	{
		/*
		 * 
		 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

			Example:
			
			Input : [1, 0]
			Return : [0, 1]
			 Lets say N = size of the array. Then, following holds true :
			* All elements in the array are in the range [0, N-1]
			* N * N does not overflow for a signed integer 
			* 
		 */
		
		ARRANGE ar = new ARRANGE();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(0);
		a.add(2);
		a.add(1);
		a.add(3);
		ar.arrange(a);

	}
	
	public void arrange(ArrayList<Integer> a) 
	{
		
		int iLength = a.size();
		for(int i=0; i< iLength; i++)
		{
						
			a.add(a.get(a.get(i)));
			
		}
		
		for(int i=0; i< iLength; i++)
		{
			
			a.remove(0);
		}
		
		for(int i=0; i< iLength; i++)
		{
			
			System.out.print(a.get(i) + " ");
		
		}
		
	}

}
