package Codility;
import java.util.*;

public class stringarray {
	
	 public static int solution(String S) {
	        // write your code in Java SE 8
	        Stack<Character> mystack=new Stack<Character>();
	        
	        for(int i=0;i<S.length();i++){
	        	if(S.charAt(i)=='{')
	        		mystack.push(S.charAt(i));
	        	else if(S.charAt(i)=='(')
	        		mystack.push(S.charAt(i));
	        	else if(S.charAt(i)=='[')
	        		mystack.push(S.charAt(i));
	        	else if(S.charAt(i)==']' & mystack.size()!=0)
	        		{
		        	if(mystack.peek()=='[')
	        			mystack.pop();
	        		else
	        			return 0;
	        		}
	        	else if(S.charAt(i)=='}' & mystack.size()!=0)
        		{
	        	if(mystack.peek()=='{')
        			mystack.pop();
        		else
        			return 0;
        		}
	        	else if(S.charAt(i)==')' & mystack.size()!=0)
        		{
	        	if(mystack.size()!=0 & mystack.peek()=='(')
        			mystack.pop();
        		else
        			return 0;
        		}
	        	else
	        		return 0;
	        	
	        
	    }
	       if(mystack.isEmpty())
	    	   return 1;
	    	   else
	    		   return 0;

}
	 public static void main(String[] args)
	    {
	    	String S="(((()";
	    	int val=solution(S);
	    	
	    	System.out.println(val);
	    }
}