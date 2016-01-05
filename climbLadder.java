package Codility;
import java.util.HashMap;

public class climbLadder {
	static HashMap<Integer, Long> myhash= new HashMap<Integer, Long>();
	
	
	 public static int[] solution(int[] A, int[] B) {
	        // write your code in Java SE 8
		   myhash.put(1,Long.valueOf(1));
		   myhash.put(2, Long.valueOf(1));
		 
		 int[] arr=new int[A.length];
		 for(int i=0;i<A.length;i++)
		 {
			 arr[i]=(int) (fib(A[i]+1)%Long.valueOf((int)Math.pow(2, B[i])));
		 }
		 
	        return arr;
	        
	    }
	 
	 public static Long fib(int n)
	 {	
		  
		  if(myhash.containsKey(n))
			 return myhash.get(n);
		  else
				 myhash.put(n,fib(n-1)+fib(n-2));
		  return myhash.get(n);
	 }
	 
	 public static void main(String args[])
	 {	
		 myhash.put(1, Long.valueOf(1));
		   myhash.put(2, Long.valueOf(1));
		 System.out.println(fib(16));
	 }
}
