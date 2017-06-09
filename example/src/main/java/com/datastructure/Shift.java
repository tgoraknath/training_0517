package com.datastructure;
import java.util.Arrays;


public class Shift {

	public static void main (String [] args){
		
	int [] array = {1,2,3,4,5,6,7,8};
    int  n =1;

   for(int i = 0; i<n; i++){

       for(int j = array.length-1; j>0; j--){
           int temp = array[j];
           array[j] = array[j-1];
           array[j-1] = temp;

       }

    }
System.out.println(Arrays.toString(array));
  
   }
       } 