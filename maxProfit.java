package Codility;

public class maxProfit {
	 public static int solution(int[] A)
	 {
		 int[] arr=new int[A.length];
		 for (int i=0;i<A.length-1;i++)
			arr[i]=A[i+1]-A[i];
		 int maxsum=0;
		 int sum=0;
		 for (int i=0;i<arr.length;i++)
			 {
			 sum=Math.max(0, sum+arr[i]);
			 if(sum>maxsum)
				 maxsum=sum;
			 }
			 
		 return maxsum;
			 
	 }
		public static void main(String args[])
		{
			int[] myarray={100,80,60,40,120,160};
			int val=solution(myarray);
			System.out.println(val);
		}
}
