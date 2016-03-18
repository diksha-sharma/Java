import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.w3c.dom.NamedNodeMap;

public class CrackingCodingInterview 
{

	public static void main(String[] args) 
	{
		
		
				
	}
	
	//Given a circular linked list, implement an algorithm which returns node at the beginning of the loop.
	//Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an earlier 
	//node, so as to make a loop in the linked list.
	//input: A -> B -> C -> D -> E -> C [the same C as earlier]
	//output: C
	public static Node beginNodeCircularLinkedList(Node nHead, int iLength)
	{
		
		Node nStartNode = new Node();
		//All nodes here will have different values - else we would never know loop node if there are duplicates
		int[] iValues = new int[iLength];
		boolean bDuplicate = false;
		int iIndex = -1;
		
		while(bDuplicate == false)
		{
			
			if(nHead.equals(null) || iLength < 2)
			{
				
				return null;
				
			}
			else 
			{
				
				for(int i=0; i< iIndex; i++)
				{
					
					if(nHead.iValue == iValues[i])
					{
						
						bDuplicate = true;						
						nStartNode = nHead;
						
					}
				
				}
				
				if(bDuplicate == false)
				{
					
					iIndex = iIndex + 1;
					iValues[iIndex] = nHead.iValue;
					
				}
				
				nHead = nHead.nNext;
				
			}
			
		}
		
		return nStartNode;
		
	}
	
	//Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
	//Input: the node ‘c’ from the linked list a->b->c->d->e
	//Result: nothing is returned, but the new linked list looks like a->b->d->e
	public static void deleteMiddleNode(Node nMiddle)
	{
		
		if(!nMiddle.equals(null))
		{
			
			if(nMiddle.nNext != null)
			{
				
				nMiddle.iValue = nMiddle.nNext.iValue;
				nMiddle.nNext = nMiddle.nNext.nNext;
				
			}		
			
		}
		
	}
	
	//Write code to remove duplicates from an unsorted linked list.
	//How would you solve this problem if a temporary buffer is not allowed?
	public static void removeDuplicatesUnsortedLinkedListNoBuffer(Node nHead, int iLength)
	{
		
		Node nTempHead = nHead;
		Node nTempStart = nHead;
		int iIndex = -1;
		boolean bDuplicate = false;
		Node nPrev = new Node();
		
		while(nHead.nNext != null)
		{
			
			
			System.out.print(nHead.iValue + " -> ");
			nHead = nHead.nNext;
			
		}
		
		System.out.print(nHead.iValue);
		nHead = nTempHead;
		System.out.println();
		
		//Check each element in the list for duplicate value
		while(nHead.nNext != null)
		{
			
			bDuplicate = false;
			nTempStart = nTempHead;
			
			while(nTempStart.nNext != nHead)
			{
				
				if(nHead.iValue == nTempStart.iValue)
				{
					
					bDuplicate = true;
					nPrev.nNext = nHead.nNext;
					
				}
				
				if(nTempStart.nNext == null)
				{
					
					break;
					
				}
				else
				{
					
					nTempStart = nTempStart.nNext;
					
				}
	
			}
			
			if(bDuplicate == false)
			{
				
				nPrev = nHead;
				
			}
		
			nHead = nHead.nNext;
			
		}
		
		bDuplicate = false;
		nTempStart = nTempHead;
		
		while(nTempStart.nNext != nHead)
		{
			
			if(nHead.iValue == nTempStart.iValue)
			{
				
				bDuplicate = true;
				nPrev.nNext = null;
				
			}
			
			if(nTempStart.nNext == null)
			{
				
				break;
				
			}
			else
			{
				
				nTempStart = nTempStart.nNext;
				
			}

		}
		
		nHead = nTempHead;
		
		while(nHead.nNext != null)
		{
			
			
			System.out.print(nHead.iValue + " -> ");
			nHead = nHead.nNext;
			
		}
		
		System.out.print(nHead.iValue);
			
	}
		
	//Write code to remove duplicates from an unsorted linked list.
	public static void removeDuplicatesUnsortedLinkedList(Node nHead, int iLength)
	{
		
		int[] iValues = new int[iLength];
		Node nTempHead = nHead;
		int iIndex = -1;
		boolean bDuplicate = false;
		Node nPrev = new Node();
		
		while(nHead.nNext != null)
		{
			
			
			System.out.print(nHead.iValue + " -> ");
			nHead = nHead.nNext;
			
		}
		
		System.out.print(nHead.iValue);
		nHead = nTempHead;
		System.out.println();
		
		//Check each element in the list for duplicate value
		while(nHead.nNext != null)
		{
			
			bDuplicate = false;
			
			for(int i=0; i< iIndex; i++)
			{
				
				if(nHead.iValue == iValues[i])
				{
					
					bDuplicate = true;
					
				}
				
			}
			
			if(bDuplicate == false)
			{
				
				iIndex = iIndex + 1;
				iValues[iIndex] = nHead.iValue;
				nPrev = nHead;
				
			}
			else
			{
				
				nPrev.nNext = nHead.nNext;
				
			}
			
			nHead = nHead.nNext;
			
		}
		
		//Check the last element in the list for duplicate value
		bDuplicate = false;
		
		for(int i=0; i< iIndex; i++)
		{
			
			if(nHead.iValue == iValues[i])
			{
				
				bDuplicate = true;
				
			}
			
		}
		
		if(bDuplicate == false)
		{
			
			iIndex = iIndex + 1;
			iValues[iIndex] = nHead.iValue;
			
		}
		else
		{
			
			nPrev.nNext = null;
			
		}
		
		nHead = nTempHead;
		
		while(nHead.nNext != null)
		{
			
			
			System.out.print(nHead.iValue + " -> ");
			nHead = nHead.nNext;
			
		}
		
		System.out.print(nHead.iValue);
		
	}
		
	//Assume you have a method isSubstring which checks if one word is a substring of another. 
	//Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only 
	//one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
	public static int rotatedSubString(String sSubString, String sMasterString)
	{
		
		String sTempString = sMasterString;
		int iLength = sTempString.length();
		char cFront;
		int iRotations = 0;
		
		while (iRotations < iLength)
		{
		
			cFront = sTempString.charAt(0);
			sTempString = sTempString.substring(1);
			sTempString = sTempString.concat(Character.toString(cFront));
			
			iRotations = iRotations + 1;
			
			if(sTempString.equals(sSubString))
			{
				
				return 1;
			}	
			
		}
		
		return 0;		
		
	}
	
	//Write a method that takes in a positive integer, return the number of 2s between 0 and the input number. 
	//If the input value given is 13, it should return 2 as the number 2 and 12 are between 0 and 13. 
	//If the input value given is 21, it should return 3 as the number 2,12 and 20 are between 0 and 21.
	public static int countTwos(int iStartRange, int iEndRange)
	{
		
		int iCount = 0;
		String sNum = "";
		
		for(int i=(iStartRange+1); i< iEndRange; i++)
		{
			
			sNum = Integer.toString(i);
			if(sNum.contains("2"))
			{
				
				iCount +=1;
				
			}
			
		}
		
		return iCount;
	}
	
	//Implement an algorithm to find the nth to last element of a singly linked list.
	public static int nthFromEndLinkedList(Node nHead, int iN)
	{
		
		Node nNode = new Node();
		nNode = nHead;
		int iLength = 1;
		
		while(nNode.nNext != null)
		{
			
			iLength = iLength + 1;
			nNode = nNode.nNext;
			
		}
		
		int iIndex = iLength - iN;
		nNode = nHead;
		for(int i=0; i< iIndex; i++)
		{
			
			nNode = nNode.nNext;
			
		}
		
		return nNode.iValue;
		
	}
	
	//Delete a Node from a Singly Linked List
	//Assuming no repeated values - if repeated values then only the first node will get deleted.
	public static Node deleteLinkedListNode(Node nHead, int iNodeValue)
	{
		
		Node nNode = new Node();
		Node nPrev = new Node();
		
		nNode = nHead;
		
		while(nNode.iValue != iNodeValue)
		{
			
			nPrev = nNode;
			nNode = nNode.nNext;
			
		}	
		
		nPrev.nNext = nNode.nNext;
		
		return nHead;
		
	}
	
	//Create a Linked List
	public static Node createLinkedList(int[] iArray)
	{
				
		Node nPrev = new Node();
		Node nHead = new Node();
		
		for (int i=0; i< iArray.length; i++)
		{
			
			Node nNode = new Node();
			if(i==0)
			{
			
				nNode.iValue = iArray[i];
				nHead = nNode;
				nPrev = nNode;
				
			}

			if(i>0)
			{

				nNode.iValue = iArray[i];
				nPrev.nNext = nNode;
				nPrev = nNode;
				
			}	
			
			if(i==(iArray.length -1))
			{
				
				nNode.nNext = null;
				
			}
			
		}	
		
		return nHead;
		
	}
	
	//Implement an algorithm to determine if a string has all unique characters. 
	//What if you can not use additional data structures?
	//Assuming case matters
	//O(n^2) time - 0 space
	public static int uniqueCharactersInString(String sInput)
	{
		String sSubString = null;
		String sChar = null;
		for(int i=0; i< (sInput.length()-1); i++)
		{
			
			sSubString = sInput.substring((i+1), (sInput.length()-1));
			sChar = Character.toString(sInput.charAt(i));
			if(sSubString.contains(sChar))
			{
				
				return 0;
			}
			
		}
		
		return 1; //Will execute this statement only when no duplicates are found in string
		
	}
	
	//Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
	//Assuming case matters
	//O(n) time and space
	public static int uniqueCharactersInStringEfficient(String sInput)
	{
		boolean[] bCharArray = new boolean[256];
		int iIndex = -1;
		
		for(int i=0; i< sInput.length(); i++)
		{
			
			iIndex = (int) sInput.charAt(i);
			if(bCharArray[iIndex])
			{
				
				return 0;
				
			}
			else
			{
				
				bCharArray[iIndex] = true;
				
			}
			
		}
		
		return 1;//Will execute this statement only when no duplicates are found in string
		
	}
	
	//Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
	//Assuming case matters
	//O(n) time and space
	public static int uniqueCharactersInStringAnotherOption(String sInput)
	{
		
		ArrayList<Character> cChar = new ArrayList<Character>();
		for(int i=0; i< sInput.length(); i++)
		{
			
			if(cChar.contains(sInput.charAt(i)))
			{
				
				return 0;
			}
			else
			{
				
				cChar.add(sInput.charAt(i));
			}
			
		}
		
		return 1;//Will execute this statement only when no duplicates are found in string
		
	}
	
	//Design an algorithm and write code to remove the duplicate characters in a string 
	//without using any additional buffer. 
	//NOTE: One or two additional variables are fine. An extra copy of the array is not.
	public static void removeDuplicatesInString(String sInput)
	{
		String sSubString = null;
		String sChar = null;
		boolean bReplaced = true;
		int iIndex = 0;
		
		while(bReplaced == true)
		{
			
			sSubString = sInput.substring(iIndex+1);
			sChar = Character.toString(sInput.charAt(iIndex));
			
			if(sSubString.contains(sChar))
			{
				
				sInput = sChar + sSubString.replace(sChar, "");
				bReplaced = true;
				
			}

			if(iIndex < sInput.length()-1)
			{
				
				iIndex = iIndex + 1;
				
			}
			
		}	
		
		System.out.println(sInput);
		
	}
	
	//Write a method to decide if two strings are anagrams or not.
	public void anagramCheck(String sInput1, String sInput2)
	{
		
		HashMap<String, Integer> hmCharCount1 = new HashMap<String, Integer>();		
		for(int i=0; i< sInput1.length(); i++)
		{
			
			if(hmCharCount1.containsKey(sInput1.charAt(i)))
			{
				
				int iValue = hmCharCount1.get(sInput1.charAt(i)).intValue();
				int iValueNew = iValue + 1;
				hmCharCount1.replace(Character.toString(sInput1.charAt(i)), iValue, iValueNew);
				
			}
			else
			{
				
				hmCharCount1.put(Character.toString(sInput1.charAt(i)), 1);
				
			}
			
		}
		
		HashMap<String, Integer> hmCharCount2 = new HashMap<String, Integer>();		
		for(int i=0; i< sInput2.length(); i++)
		{
			
			if(hmCharCount2.containsKey(sInput2.charAt(i)))
			{
				
				int iValue = hmCharCount2.get(sInput2.charAt(i)).intValue();
				int iValueNew = iValue + 1;
				hmCharCount2.replace(Character.toString(sInput2.charAt(i)), iValue, iValueNew);
				
			}
			else
			{
				
				hmCharCount2.put(Character.toString(sInput2.charAt(i)), 1);
				
			}
			
		}	

		if(hmCharCount1.size() > hmCharCount2.size())
		{
			
			for(String sChar: hmCharCount1.keySet())
			{
				
				if(!hmCharCount2.containsKey(sChar))
				{
					
					System.out.println("Strings are not anagram! ");
					return;
					
				}
				else if(hmCharCount2.containsKey(sChar) && (hmCharCount1.get(sChar).intValue() != hmCharCount2.get(sChar).intValue()))
				{
					
					System.out.println("Strings are not anagram! ");
					return;
					
				}
				
			}
			
		}
		else
		{
			
			for(String sChar: hmCharCount2.keySet())
			{
				
				if(!hmCharCount1.containsKey(sChar))
				{
					
					System.out.println("Strings are not anagram! ");
					return;
					
				}
				else if(hmCharCount1.containsKey(sChar) && (hmCharCount2.get(sChar).intValue() != hmCharCount1.get(sChar).intValue()))
				{
					
					System.out.println("Strings are not anagram! ");
					return;
					
				}
				
			}
			
		}
		
		
		
		System.out.println("Strings are anagram! ");
		return;
				
	}
	
	//Write a method to replace all spaces in a string with ‘%20’.
	public void replaceSpaces(String sInput)
	{
		
		if(sInput.contains(" "))
		{
			
			sInput = sInput.replaceAll(" ", "%20");
			
		}
		
		System.out.println(sInput);
	}
	
	//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
	public static void setMatrixColRowZero(int[][] iArray)
	{

		int[][] iSetZero = new int[20][2];
		int iIndex = 0;
		
		for(int i=0; i< iArray.length; i++)
		{
			
			for(int  j= 0; j< iArray[i].length; j++)
			{
				
				if(iArray[i][j] == 0)
				{
					
					iSetZero[iIndex][0] = i;
					iSetZero[iIndex][1] = j;
					iIndex = iIndex + 1;
					
				}
				
			}			
			
		}	
		
		for(int k=0; k < iIndex; k++)
		{
			
			for(int i=0; i< iArray.length; i++)
			{
				
				for(int  j= 0; j< iArray[i].length; j++)
				{
					
					if(i== iSetZero[k][0] || j== iSetZero[k][1])
					{
						
						iArray[i][j] = 0;
						
					}
					
				}
				
			}
			
		}
		
		for(int i=0; i< iArray.length; i++)
		{
			
			for(int  j= 0; j< iArray[i].length; j++)
			{
				
				System.out.print(iArray[i][j] + ", ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	//create pallindrome in java script, by appending a minimum set of characters at the end.. eg. test => testset
	public static void minSetPallindrome(String sInput)
	{
		
		String sReverse = "";
		
		if(sInput.length() %2 == 0)
		{
						
			for(int i=sInput.length()-2; i>=0 ; i--)
			{
			
				sReverse = sReverse + sInput.charAt(i);
				
			}					
			
		}
		else
		{
			
			for(int i=sInput.length()-1; i>=0 ; i--)
			{
			
				sReverse = sReverse + sInput.charAt(i);
				
			}
			
		}
		
		int iIndex = 0;
		
		while(isPallindrome(sInput) != 1)
		{
			
			sInput = sInput + Character.toString(sReverse.charAt(iIndex));			
			iIndex = iIndex + 1;
						
		}
		
		System.out.println(sInput);
		
	}
	
	//Returns 1 if the string is pallindrome else returns 0
	public static int isPallindrome(String sInput)
	{
		
		int iMid = (int) (sInput.length() /2);
			
		for(int i =0; i< iMid; i++)
		{
			
			if(sInput.charAt(i) != sInput.charAt(sInput.length()-i-1))
			{
				
				return 0;
				
			}
			
		}
		
		return 1;
		
	}
	
	//Returns the max decimal value possible in a row from a matrix of 0 and 1 only
	//Given 2D Array of only 0s and 1s, Find the row which gives max decimal value. 
	//Input: int array[3][3] = {{0,1,0,}{1,1,0},{1,0,1}}; 
	//Output : 2(second row)...decimal value is 6
	public static long maxDecimalValueMatrix(int[][] iArray)
	{
		long lMax = 0;
		long[] lValues = new long[iArray.length];
		long lTemp = 0;
		int iPow = -1;
		for(int i=0; i< iArray.length; i++)
		{
			
			lTemp = 0;
			iPow = -1;
			for(int j=(iArray[i].length-1); j>=0 ; j--)
			{
				
				iPow = iPow + 1;
				if(iArray[i][j] == 1)
				{
					
					lTemp = lTemp  + (long) Math.pow(2, iPow);
					
				}	
				
			}
			
			lValues[i] = lTemp;
			
		}		
		
		for(int i=0; i< lValues.length; i++)
		{
			
			if(lValues[i] > lMax)
			{
				
				lMax = lValues[i];
				
			}
			
		}
		
		return lMax;
		
	}
	
	//Returns the org hierarchy of a company passed as a string array
	//Given employee information in an organisation in the formal - emp_id,firstname,lastname,reports_to in the following way 
	//{ 
		//string[] Values = new[] { "3,Mc,Grill,Karmon","4,Zech,Karmon,Joe","2,Try,Mithun,Joe","1,Top,Joe, ","6,Aman,Zara,Mc Grill","5,Dude,Fizzy,Mc Grill"}; 

	//} 
	//Print the information from the top to bottom level in the way 
	//1) Top Joe 
	//2) Try Mithun 
	//2) Zech Karmon 
	//3) Mc Grill 
	//4)Aman Zara 
	//4) Dude Fizzy
	public static void getOrg(String[] sEmployees)
	{
		
		ArrayList<Employee> alOrg = new ArrayList<Employee>();
		ArrayList<String> alOrgChart = new ArrayList<String>();
		StringTokenizer st;		
		
		for(int i= 0; i< sEmployees.length; i++)
		{
			
			Employee eTemp = new Employee();
			st = new StringTokenizer(sEmployees[i],",");
			if(st.hasMoreTokens())
			{
				
				eTemp.sId = st.nextToken();
				
			}			
			
			if(st.hasMoreTokens())
			{
				
				eTemp.sFirstName = st.nextToken();
			}
			
			if(st.hasMoreTokens())
			{
				
				eTemp.sLastName = st.nextToken();
				
			}			
			
			if(st.hasMoreTokens())
			{
				
				eTemp.sManager = st.nextToken();
			}
			
			alOrg.add(eTemp);
			
		}

		boolean bAdded = false;
		boolean bNewAdded = true;
		
		while(bNewAdded == true)
		{
			
			bNewAdded = false;
			if(alOrgChart.isEmpty())
			{
				
				for(int i=0; i< alOrg.size(); i++)
				{

					if(alOrg.get(i).sManager == null)
					{
						
						String sEmployee = alOrg.get(i).sLastName;
						alOrgChart.add(sEmployee);
						bNewAdded = true;
						break;
						
					}					
									
				}
				
			}			
			
			//Assuming no two employees have same names and manager name is the last name of the manager
			for(int i=0; i< alOrgChart.size(); i++)
			{
				
				for(int j=0; j< alOrg.size(); j++)
				{
					
					bAdded = false;
					
					if(alOrg.get(j).sManager != null && alOrg.get(j).sManager.equals(alOrgChart.get(i)))
					{
						
						String sEmployee = alOrg.get(j).sLastName;
						
						for(int k=0; k < alOrgChart.size(); k++)
						{
							
							if(sEmployee == alOrgChart.get(k))
							{
								
								bAdded = true;
								
							}
							
						}
						
						if(bAdded == false)
						{
							
							bNewAdded = true;
							alOrgChart.add(sEmployee);
							
						}
												
					}
					
				}
							
			}
			
		}
		
		for(int i=0; i< alOrgChart.size(); i++)
		{
			
			System.out.println((i+1) + ".  " + alOrgChart.get(i));
		}
		
	}

}
