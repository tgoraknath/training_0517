
	package com.datastructure;

	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class ListPal {
		
		public static void Pal(List<Integer> isPal) {
		
			
			int n = isPal.size();
			int temp = 0;
			int i = 0;
			while ( i < (n + 1) / 2) {
				if (isPal.get(i) != isPal.get(n - 1 - i)) {
					temp = 1;
				}
				i++;
			}
			if (temp == 0)
				System.out.println("pal");
			else
				System.out.println("not pal");

		}
		
		public static void main (String[] args){
		
		List<Integer> li = Arrays.asList(1,2,3,4,3,2,1);
		Pal(li);
	}
	
	
	

}
