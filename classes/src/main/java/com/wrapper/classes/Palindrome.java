package com.wrapper.classes;

import java.util.Scanner;

public class Palindrome {
	
	/* pseudocode :
	 * if string.length == 0 or string.length==1
	 * return true
	 * else if string.charAt(0) == string.charAt(string.length() - 1)
	 * return string.substring( 1, string.length() - 1
	 * else 
	 * return false 
	 * 
	 */
	public static boolean pal(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true; // when there is no  string or when there is a string of single letter. print true.
		else if (s.charAt(0) == s.charAt(s.length() - 1)) 
			
			return pal(s.substring(1, s.length() - 1));
		/*
		 let the string input is sree. 
		 s == e 
		 prints false
		 let  the input is acbca 
		 a == a true .. return ( cbc )
		 c == c true .. return ( b )
		 s.length() == 1
		 prints true.
		*/
		else 
		
		return false;
	}

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = scan.nextLine();
		/*
		 * If function returns true then the string is palindrome else it prints not a palindrome.
		 */
		if (pal(string))
			System.out.println(string + " is a palindrome");
		else
	
			System.out.println(string + " is not a palindrome");
	
	}
}