package com.datastructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ShiftList {
	
	
	   public static void main(String[] args) {
	  	   List<Integer> numbers = new ArrayList<>();
	      
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	
	for (int i=0;i<5;i++)
	{
	   Collections.rotate(numbers, 1);
	   System.out.println(Arrays.toString(numbers.toArray()));
	}
	   	 
   }
	}

