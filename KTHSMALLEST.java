import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KTHSMALLEST 
{

	public static void main(String[] args) 
	{
		/* 
		 * Find the kth smallest element in an unsorted array of non-negative integers.

			Definition of kth smallest element
			
			 kth smallest element is the minimum possible n such that there are at least k elements in the array <= n.
			In other words, if the array A was sorted, then A[k - 1] ( k is 1 based, while the arrays are 0 based ) 
			NOTE
			You are not allowed to modify the array ( The array is read only ). 
			Try to do it using constant extra space.
			
			Example:
			
			A : [2 1 4 3 2]
			k : 3
			
			answer : 2
		 * 
		 */
		
		List<Integer> lList = new ArrayList<Integer>();
		KTHSMALLEST ks = new KTHSMALLEST();
		
		lList.add(2);
		lList.add(1);
		lList.add(4);
		lList.add(3);
		lList.add(2);
				
		int iResult = ks.kthsmallest(lList, 3);
		System.out.println(iResult);

	}
	
	public int kthsmallest(final List<Integer> a, int k) 
	{
		
		List<Integer> lNewList = new ArrayList<Integer>();
		lNewList.addAll(a);
		
		Collections.sort(lNewList);
				
		return lNewList.get(k-1);
	}
}
