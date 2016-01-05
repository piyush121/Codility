package Codility;

public class maxSubarray {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int maxsum=0;
        int sum=0;
        for(int i=0;i<A.length;i++)
           {
               sum=Math.max(0,sum+A[i]);
               if(sum>maxsum)
                maxsum=sum;
           }
           
           if(maxsum>0)
             return maxsum;
            else
                {
                    int high=A[0];
                    for(int i=1;i<A.length;i++)
                        if(A[i]>high)
                            high=A[i];
                    return high;
                }
            
    }

	public static void main(String[] args)
	{
		int[] arr={3,-2,3};
		System.out.println(solution(arr));
	}
}
