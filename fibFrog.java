package Codility;

import java.util.HashMap;
import java.util.HashSet;

public class fibFrog {
	
	static HashMap<Integer, Integer> myhash = new HashMap<Integer,Integer>();
	static HashSet<Integer> myset = new HashSet<Integer>();
	

	
	 public static void fib()
	 {	myhash.put(0,0);
	    myhash.put(1,1);
	 
		 for(int n=2;n<27;n++)
			{
			
		  if(myhash.containsKey(n))
			  	continue;
			  else
				 myhash.put(n,myhash.get(n-1)+myhash.get(n-2));
		 
			}
		 for (Integer value : myhash.values()) 
		    {
			    myset.add(value);
			}
	 }
	 
	 
	 public static int solution(int[] A)
	 {	 
		 int curr=-1;
		 int remainJump=A.length-curr;
	 	 int jumps=0;
	 	 
		 if(myset.contains(remainJump))
		 			return jumps+1;
		 
		 for(int i=A.length-1;i>curr;i--)
		 {		
			 if(myset.contains(remainJump))
	 			return jumps+1;
			 
		 
			 if(A[i]==1 && myset.contains(i-curr))
			 {	
				 jumps++;
				 curr=i;
				 remainJump = A.length-curr ;
				 i=A.length-1;
				 System.out.println("Curr: "+curr);
			 }
		 }
		 if(remainJump!=0)
			 return -1;
		 return jumps;
	 }
	 
	 public static void main(String[] args)
	 {
		 fib();
		 int [] arr={0,0,0};
		 
	 
		 System.out.println("Total Jumps: "+solution(arr));
		 
	 }
}

