package Codility;
import java.util.Stack;

public class fishStack {
	
		    public static int solution(int[] A, int[] B) {
	        // write your code in Java SE 8
		    	Stack<Integer> mystack=new Stack<Integer>();
		    	Stack<Integer> mystack1=new Stack<Integer>();
		    	
		    	for(int i=0;i<B.length;i++){
		    		if(mystack.isEmpty() | B[i]==1)
		    			{
		    			mystack.push(B[i]);
		    			mystack1.push(A[i]);
		    			}
		    		else
		    			{
		    			if(mystack.peek()==0)
		    			{
			    			mystack.push(B[i]);
			    			mystack1.push(A[i]);
			    		}
		    			else{
		    				if(mystack1.peek()< A[i] )
		    				{	while(mystack1.peek()< A[i] & mystack.peek()==1)
		    					
		    					{
			    					mystack.pop();
			    					mystack1.pop();
			    					if(mystack.size()==0)
			    							break;
		    					}
			    				if(mystack.size()==0 )
			    				{
			    					mystack.push(B[i]);
					    			mystack1.push(A[i]);
			    				}
			    				else if( mystack.peek()==0)
			    				{
			    					mystack.push(B[i]);
					    			mystack1.push(A[i]);
			    				}
		    				}
		    				
		    			}
		    				
		    			}
		    	}
		    	
	        return mystack.size();
	        
	    }
		    public static void main(String[] args){
		    	int A[]={4, 3, 2, 1, 5};
		    	int B[]={0, 1, 0, 0, 0};
		    	
		    	int val = solution(A,B);
		    	System.out.println(val);
		    	
		    	
		    }
	}

