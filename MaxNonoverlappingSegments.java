/**
 * 
 */
package Codility;

/**
 * @author piyush
 *
 */
public class MaxNonoverlappingSegments {

	public static int solution(int[] A, int[] B)
	{	
		if(A.length==0 || B.length==0)
            return 0;
		int count=1;
		int j=0;
		for(int i=1;i<B.length;i++)
			{	
				if(B[j]<A[i])
				{
					j=i;
					count++;
				}
			}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={};
		int[] arr2={};
		System.out.println(solution(arr1,arr2));
		

	}

}
