package com.datastructure;

import java.util.Stack;

public class Min extends Stack<Integer>{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stack<Integer> min = new Stack<Integer>();
    
	//Stack<Integer> stack = new Stack<Integer>();
        
     
    @Override
    public Integer push(Integer x) {
           
        if(min.isEmpty() || x <= min.peek())
            min.push(x);
       return super.push(x); 
    }
    @Override
    public Integer pop() {
    	int a = super.pop();
    	return a;
    	
    }
    
  
  
    public int getMin() {
        if(min.isEmpty())
            return -1;
        else 
            return min.peek();
        
    }
    
public static void main(String[] args){
	

	Min min = new Min();
	min.push(10);
	min.push(6);
	min.push(2);
	min.push(1);
	System.out.println(min.getMin());
	min.pop();
	System.out.println(min.getMin());
}

}