package com.datastructure;
import java.util.Arrays;
import java.util.List;
public class ShiftList {

	
	public static void ListLeftShift(List<Integer> li, int numOfPositions ){
		int size = li.size();
		System.out.println("all possible combinations while shifting the list are:");
		for(int i = 0; i < numOfPositions; i++){
		int j, temp;
		temp = li.get(0);
		
		for(j = 0; j < size-1; j++){
			li.set(j, li.get(j+1));
			
		}
		li.set(j, temp);
		int k = i+1;
		System.out.println("For  " +k+ "  rotation(s) the List is:");
		System.out.println(Arrays.toString(li.toArray()));
	}
		
		
	}
     public static void main(String[] args){
    		 List<Integer> list = Arrays.asList(1,2,4,5,3,6);
    		 ListLeftShift(list, 6);
     }
}
	
	
	
	
	
	
	
	
	
	