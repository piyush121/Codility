package Codility;
import java.lang.Math;

public class maxDoubleSlice {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		
		 int [] max_end=new int[A.length];
		 int [] max_start=new int[A.length];
		int maxsum=0;
		
		for(int i=1;i<A.length-1;i++)
		{
			maxsum=Math.max(0,A[i]+maxsum);
			max_end[i]=maxsum;
		}
		
		maxsum=0;
		for(int i=A.length-2;i>0;i--)
		{
			maxsum=Math.max(0,A[i]+maxsum);
			max_start[i]=maxsum;
		}
		maxsum=0;
		for(int i=1;i<A.length-1;i++)
			maxsum=Math.max(max_end[i-1]+max_start[i+1], maxsum);
		
		
		return maxsum;
		
    }
	
	public static void main(String[] args)
	{
		 int arr[]={ 6, 1, 5, 6, 4, 2, 9, 4};
		
		int val=solution(arr);
		System.out.println(val);
		
	
	}

}
