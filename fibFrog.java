package Codility;

import java.util.HashMap;

public class fibFrog {
	
	static HashMap<Integer, Integer> myhash = new HashMap<Integer,Integer>();
	
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
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 fib();
		 System.out.println(myhash.get(26));
		 
	 }
}

