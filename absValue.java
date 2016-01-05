package Codility;

import java.util.HashMap;

public class absValue {
	
	public static int solution(int[] A)
	{
		HashMap<Integer,Integer> mymap=new HashMap<Integer,Integer>();
		for(Integer val : A)
			if(mymap.containsKey(Math.abs(val)))
				continue;
			else
				mymap.put(Math.abs(val), 1);
		return mymap.size();
	}

	public static int solution1(int[] A) //if all values are distinct only then this method would work
	{
		int counter=A.length-1;
		int val=0;
		for(int i=0;i<A.length;i++)
		{
			if(Math.abs(A[i])>Math.abs(A[counter]))
				continue;
			else if (Math.abs(A[i])<Math.abs(A[counter]))
			{
				while(Math.abs(A[i])<Math.abs(A[counter]))
					counter--;
			}
			else
				{
				if(counter==i)
					return val;
				else
					{	System.out.println("hi");
						val++;
						counter--;
					}
				}
		}
		return val;
	}
	
	public static void main(String[] args)
	{
		int [] arr= {0, 1,1,2};
		int val=solution(arr);

		System.out.println("Solution: "+val);

		
	}
}
