package Codility;
import java.util.*;
/* An integer M and a non-empty zero-indexed array A consisting of N non-negative integers are given.
 *  All integers in array A are less than or equal to M.

A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A.
The slice consists of the elements A[P], A[P + 1], ..., A[Q].
A distinct slice is a slice consisting of only unique numbers. 
That is, no individual number occurs more than once in the slice.

For example, consider integer M = 6 and array A such that:

    A[0] = 3
    A[1] = 4
    A[2] = 5
    A[3] = 5
    A[4] = 2
There are exactly nine distinct slices: (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2), (3, 3), (3, 4) and (4, 4).
*/
public class CountDistinctSlices {
	
	public static int solution(int M, int A[], int N)
	{	int slices=0;
		int j=0;
		HashSet<Integer> myhash=new HashSet<>();
		for(int i=0;i<A.length;)
		{
			if(!myhash.contains(A[i]))
				{	
					myhash.add(A[i]);
					slices++;

				}
			
			else 
				{	
					myhash.clear();
					i=j;
					j++;
				}
			if(i==A.length-1)
			{
				myhash.clear();
			}
			i++;
		}
		
		return slices;
		
	}
	
	public static int solution1(int M, int A[], int N)
	{	int j=0;
		int slices=0;
		HashSet<Integer> myhash=new HashSet<>();
		for(int i=0;i<A.length;i++)
		{
			if(!myhash.contains(A[i]))
				{	
					myhash.add(A[i]);
					j++;
				}
			else 
			{	
				myhash.clear();
				myhash.add(A[i]);
				slices+=j*(j+1)/2;
				j=1;
				
			}
			
		}
		slices+=j*(j+1)/2;
		return slices;
	}

	public static void main(String[] args)
	{
		int[] arr={3,4,5,5,5};
		System.out.println(solution1(6, arr, 5));
	}
}
