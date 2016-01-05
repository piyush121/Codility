package Codility;
import java.util.*;

public class solution {
    public static int solution1(int[] H) {
        // write your code in Java SE 8
        int count=1;
        Stack<Integer> mystack=new Stack<Integer>();
        mystack.push(H[0]);
        for(int i=1;i<H.length;i++){
            if(mystack.isEmpty())
                {
                    mystack.push(H[i]);
                    count++;
                }
        	if(mystack.peek()<H[i])
        		{
        		mystack.push(H[i]);
        			count++;
        			}
            else
               {
                   while(mystack.size()>0 )
                   {	if(mystack.peek()>H[i])
                         	mystack.pop();
	                   if(mystack.empty())
	              		{
	                       mystack.push(H[i]);
	                       count++;
	                       break;
	                    }
                   		else if(mystack.peek()<H[i])
	                        {
	                            mystack.push(H[i]);
	                            count++;
	                            break;
	                        }
                   		else if(mystack.peek()==H[i])
                   				break;
                   		
                   				
                   }
               }
        }
            return count;
           
    }
    
    public static void main(String[] args)
    {
    	int arr[]={8, 8, 5, 7, 9, 8, 7, 4, 8};
    	int val=solution1(arr);
    	
    	System.out.println(val);
    }
}