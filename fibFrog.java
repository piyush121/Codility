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
		 int jumps=0;
		 int[] copy=A.clone();
		 int curr=-1;
		 int remainJump=A.length-curr;
	 	 
	 	 
		 if(myset.contains(remainJump))
		 			{
					 remainJump=0;		
					 jumps++;
					 return jumps;
		 			}
		 
		 for(int i=A.length-1;i>curr;i--)
		 {		
			 if(myset.contains(remainJump))
			 {
				 remainJump=0;			
				 jumps++;
				 break;			 
	 			}
		 
			 if(A[i]==1 && myset.contains(i-curr))
			 {	// System.out.println(A[i]);
				 jumps++;
				 curr=i;
				 remainJump = A.length-curr ;
				 i=A.length;
				 System.out.println("Curr: "+curr);
				 System.out.println("Remaining Jumps: "+remainJump);

			 }
			 
		 }
		
		 if(remainJump!=0)
			 jumps=0;
		 
		 if( curr != -1)
		 {	 
			 copy[curr]=0;
			 int newjump=solution(copy);				//Recursion
			 //System.out.println("New Jumps: "+newjump);

			 if ((jumps>newjump && newjump > 0) || jumps==0 && newjump>0)
				 jumps=newjump;
			 
		 }
		 
		 if(remainJump!=0 & jumps==0)
			 return -1;
		 
		 return jumps;
	 }
	 
	 public static void main(String[] args)
	 {
		 fib();
		 int [] arr={0,0,0,1,1,0,1,0,0,0,0};
		 int[] arr1={1,1,0,0,0};
		 int[] arr2={1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
		 
	 
		 System.out.println("Total Jumps: "+solution(arr));
		 
	 }
}

