package Codility;

import java.util.Arrays;

public class countTriangles {
	public static int solution(int[] A)					//O n^2 coz we don't need to set k again after 2nd loop.
	{	
		Arrays.sort(A);
		int i,j,k,count=0;
		for(i=0;i<A.length-2;i++)
		{	
			k=i+2;
			for(j=i+1;j<A.length-1;j++)
			{
				while(k<A.length && A[i]+A[j]>A[k] )
						{	
							count+=k-j;
							++k;
						}
				
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int[] arr={10,2,5,1,8,12};
		System.out.print(solution(arr));
	}
}
