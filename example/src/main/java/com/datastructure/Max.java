package com.datastructure;

import java.util.Stack;


public class Max{
    Stack<Integer> maxStack = new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
        
     
    
    public void push(int x) {
        stack.push(x);    
        if(maxStack.isEmpty() || x > maxStack.peek())
            maxStack.push(x);
    }
    
     
    public int getmax() {
        if(maxStack.isEmpty())
            return -1;
        else 
            return maxStack.peek();
        
    }
public static void main(String[] args){
	

	Max max = new Max();
	max.push(10);
	max.push(24);
	max.push(12);
	max.push(6);
	
	System.out.println(max.getmax());
}

}