package Codility;

public class TieRopes {
	public int solution(int K, int[] A)
	{
		int count=0;
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum+=A[i];
			if(sum<K)
				continue;
			else
			{
				sum=0;
				count++;
			}
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
