package Codility;

import java.util.Arrays;   //100% ON CODILITY :D //
/*Let A be a non-empty zero-indexed array consisting of N integers.

The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.

For example, the following array A:

  A[0] =  1
  A[1] =  4
  A[2] = -3
has pairs of indices (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2). 
The abs sum of two for the pair (0, 0) is A[0] + A[0] = |1 + 1| = 2. 
The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4| = 5. 
The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2. 
The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8. 
The abs sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1. 
The abs sum of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6. 
*/

public class MinAbsSumOfTwo {
	
	public static int solution(int[] A)
	{
		 if(A.length==1)
	            return Math.abs(2*A[0]);
	        int neg=0;
			int min=2000000000;
			Arrays.sort(A);
		if(A[0]>=0)
			return A[0]+A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]<=0)
				neg=i;
		}
		
		
		for(int i=0;i<=neg;i++)
		{	System.out.println("Looking for closest value to "+Math.abs(A[i]));
			int key=Arrays.binarySearch(A,neg+1,A.length,Math.abs(A[i]));
			
			if(key<0)
				key=Math.abs(key)-2;
			System.out.println("Found closest match: "+A[key]);
			System.out.println("Min sum = "+Math.abs(A[i]+A[key]));
			if(Math.abs(A[i]+A[key])<Math.abs(min))
				min=Math.abs(A[i]+A[key]);
			if(key<A.length-1 && Math.abs(A[i]+A[key+1])<Math.abs(min))
				min=Math.abs(A[i]+A[key+1]);
			
		}
		return min;
			
		
	}
	public static void main(String[] args) {
		int [] arr={1,4,-3};
		System.out.println("Minimum Sum=" + solution(arr));
		
		
	}

}
