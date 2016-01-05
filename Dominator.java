package Codility;

import java.util.HashMap;

public class Dominator {
	static int dominator,domcount;
	
	public static void solution(int[] A) {
        // write your code in Java SE 8
		HashMap<Integer,Integer> myhash=new HashMap<Integer,Integer>();
		int dom=A.length/2;
		if(A.length==1)
		{
			dominator=A[0];
			domcount=1;
			}
		
		for(int i=0;i<A.length;i++)
		{
		if(myhash.containsKey(A[i]))
		{	
			int count=myhash.get(A[i]);
			myhash.put(A[i],count+1);
			if(myhash.get(A[i])>dom)
			    {	dominator= A[i];
			    	domcount=myhash.get(A[i]);
			    }
		}
		else
			myhash.put(A[i],1);
		
		}
	
	//	for(HashMap.Entry<Integer,Integer> entry : myhash.entrySet())
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
	    	
	 }
	
	 public static void main(String[] args){
	    	int arr[]={4,3,4,4,4,2};
	    	solution(arr);
	    	
	    	System.out.println("Dominator value: "+ dominator);
	    	int counter=0;
	    	
	    	for(int i=0;i<arr.length;i++)
	    	{	if(arr[i]==dominator)
	    	{		counter++; 
	    			if( (((i+1)/2) < counter) & (((arr.length - (i + 1))/2) < ( domcount - counter))  )
	    				System.out.println("equidom = " + i);
	    	}
	    	}
	    	
	    	
	    }

}
