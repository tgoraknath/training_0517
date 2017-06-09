package com.datastructure;


import java.util.HashSet;

public class Unique {
		    
	    public static void main (String args[])
	    {
	        boolean result=false;
	        String inputstring="nithish";
	        HashSet < Character> uniquecharset= new HashSet<Character>();
	        for(int i=0;i < inputstring.length();i++)
	        {
	            result=uniquecharset.add(inputstring.charAt(i));
	         
	        }
	    System.out.println(result); }
	}

