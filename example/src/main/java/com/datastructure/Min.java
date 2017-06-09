package com.datastructure;

import java.util.Stack;

public class Min{
    Stack<Integer> min = new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
        
     
    
    public void push(int x) {
        stack.push(x);    
        if(min.isEmpty() || x <= min.peek())
            min.push(x);
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
	min.push(1);
	min.push(2);
	min.push(6);
	
	System.out.println(min.getMin());
}

}