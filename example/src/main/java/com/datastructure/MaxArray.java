package com.datastructure;

// find the max of a sorted array
// {1,2,3,4,5,6} {6,5,4,3,2,1}
//find the max of an unsorted array   {1,5,6,2,4,3}


public class MaxArray {

	   public static void sortedMaxMin(int[] ar){
		  int  n = ar.length - 1;
		   if (ar[0]>ar[1]){
			   System.out.println("max is" + ar[0]);
			   System.out.println("min is" +ar[n]);
		   }
		   else {
			   System.out.println("max is" + ar[n]);
			   System.out.println("min is" + ar[0]);
		   }
	   }
	   public static void printMaxMin(int[] a){
		   int b = a[0];
		   int d = a[0];
		   		   
		   for(int i=0; i<a.length; i++){
			  
			   if(a[i]>b){
				   b = a[i];
			   }
			   else if(a[i]<d){
				   d = a[i];
			   }   
			   
			   		   }
		  System.out.println("Max of the array is:" +b);
	      System.out.println("Min is :" +d);
		  
	   }
	
	   public static int max(int[] array, int index) {
	       if(index==array.length-1) {
	           return array[index];
	       } else if(array[index]>array[index+1]) {
	           array[index+1]=array[index];
	       }
	       return max(array,index+1);        
	   }
	   
	        public static void main (String[] args)
	        {
	               int[] array = {1,2,3,4,5,6,7,8,9,10};
	               int[] array1 = {10,9,8,7,6,5,4,3,2,1};
	               sortedMaxMin(array);
	               sortedMaxMin(array1);
	               printMaxMin(array);
	               int c=max(array, 0);
	               System.out.println(c);
	               
	             
	               
	        }
	}