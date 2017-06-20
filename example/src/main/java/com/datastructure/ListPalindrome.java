package com.datastructure;

import java.util.ArrayList;
import java.util.List;

public class ListPalindrome {

	public static void main(String[] args) {
		List<Integer> isPal = new ArrayList<Integer>();
		isPal.add(1);
		isPal.add(2);
		isPal.add(2);
		isPal.add(2);
		isPal.add(1);
		int n = isPal.size();
		int temp = 0;
		for (int i = 0; i < (n + 1) / 2; i++) {
			if (isPal.get(i) != isPal.get(n - 1 - i)) {
				temp = 1;
			}
		}
		if (temp == 0)
			System.out.println("pal");
		else
			System.out.println("not pal");

	}
}