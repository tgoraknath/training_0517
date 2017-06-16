package com.datastructure;

public class MinArray {
	  public static int max(int[] array, int index) {
	       if(index==array.length-1) {
	           return array[index];
	       } else if(array[index]<array[index+1]) {
	           array[index+1]=array[index];
	       }
	       return max(array,index+1);        
	   }
	   
	        public static void main (String[] args)
	        {
	               int[] array = {1,2,0,6,5};
	               int a=max(array, 4);
	               System.out.println(a);
	               
	        }

}
