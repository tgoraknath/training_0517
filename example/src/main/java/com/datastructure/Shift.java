package com.datastructure;
import java.util.Arrays;


public class Shift {
	private static void recursiveRR(int[] chars, int rby, int p, int v) {
		  int tbp = p + rby;
		  int l = chars.length;
		  if(tbp >= l) {
			   tbp = tbp-l; 
			  }
		  if(tbp == 0 || rby >= l) {
		   chars[0] = v;
		   return;
		  }
		
		  int tbv = chars[tbp];
		  chars[tbp] = v;
		  
		  recursiveRR(chars, rby, tbp, tbv);
		  
		 }
	public static void main (String [] args){
	
	int [] array = {10,20,30,40,50,60,70,80};
	// at 3rd iteration: 6+3 = 9 = 9-8 = 1
	recursiveRR(array, 3, 0, array[0]);
	System.out.println(Arrays.toString(array));
    
    
 
   }
       } 