package com.wrapper.classes;

/**
 * Hello world!
 *
 */

    
    	public class StringDemo {
    		
    		/* pseudo code :  
    		
    		if (string == null) or (string.length() <= 1) 
    		return string;
    		else
    		return reverse(string.substring(1) + string.charAt(0);
    		
    		*/
    	     
    		public String reverse(String str) 
    	    {     
    	        if ((str==null)||(str.length() <= 1) ) // if it there is no value or a single letter the same letter will be returned.
    	            return str;
    	        else 
    	        return reverse(str.substring(1)) + str.charAt(0); 
    	        /* Sree
    	         * (ree + S)
    	         * ((ee + r) + S)
    	         * (((e + e) + r) +S)
    	         * satisfies first condition str = null and length = 0; returns eers. 
    	         */
    	    }
    		 
    		public static void main (String args[]){
    			   
    			  StringDemo obj=new StringDemo();
    		        String str = "Sree";
    		        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");
    		        System.out.println(str.substring(1) + str.charAt(0));
    			 
    		        
    		        // string class declarations.....
    			   char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' }; 
    			   String msg = ("hello world"); // declaring a string to a variable. 
     		      msg = msg.toUpperCase();
     		      
     		      // cutoff value of int
     		      // float byte long
     		 
     		     
      		    // reverse of a string without reverse method;
      		     
      		    for(int i=msg.length()-1;i>=0;--i) // 10;  true ; 9 {  print char at 10 = D}
      		    {
      		    System.out.println(msg.charAt(i));
      		    }
      		    
      	 	
     		    
     		      System.out.println(msg);
     		      String helloString = new String(helloArray);  // creating string object
     		      System.out.println( helloString );  
     		      System.out.println( msg );
     		      int a = msg.length(); // string length method
     		      System.out.println("the length of the msg is" +a);
     		      String b = "world ";
     		      System.out.println("hello " + b + "how are you");// concatination using + sign
     		        
     		      StringBuffer stringBuffer = new StringBuffer(50); //string buffer initially has a capacity of 16 and it increases according to the data added
     		      System.out.println("the capacity of the string buffer is " + stringBuffer.capacity());// this method finds out the total capcity of the buffer.
    			//  stringBuffer.r
     		      // integer class
       		     // int i;
     		      System.out.println("the max value among 1243 and 1245 is " + Integer.max(1243, 1245)); // prints the max value... Integer.min() for minimum value.
     		      Integer i = 101;
     		     // Integer.parseInt("navya");
     		      i = Integer.valueOf("123");
     		      
     		      System.out.println("the value of i" +i);
     		     
     		      System.out.println("Binary value of i is " + Integer.toBinaryString(i)); // converts to binary 
     		      System.out.println("number of 1 bits of i is " + Integer.bitCount(i)); // counts the no of 1 bits in the sequence
     		      Integer j = 101;
     		      if (i==j){
     		    	  System.out.println("i and j are equal by reference");
     		      
     		      }
     		      else {
     		    	  System.out.println("they are not equal");
     		      }
     		      System.out.println("i and j are equal   " + i.equals(j)); // checks equality
     		      String s = "123";
     		      System.out.println(Integer.getInteger(str));  // determines the integer value
     		    
     		      
     		      
     		      
     		      /*byteValue(int i) : gives the byte value of the number.
     		       * inti.compareTo(inty) : compares the values of i and y.
     		       * decode(String nm): decodes a string into integer
     		       * floatValue() : returns the float value of the  integer
     		       * 
     		       * 
     		       * 
     		       */
     		      
     		      // math class 
     		      
     		     System.out.println(Math.expm1(a));
     		     System.out.println("log10(" + a + ")=" + Math.log10(a));
     		     System.out.println("nextUp of 123.4567 is " + Math.nextUp(123.4567));
     		     System.out.println("power:" + Math.pow(2,3));
     		     System.out.println("rint of 123.4567001 =" + Math.rint(123.4567001));
     		     System.out.println("ulp of 123.456 " + Math.ulp(123.456));
     		     System.out.println("radian value of 90is" + Math.toRadians(90));
     		     
     		     
     		     // boolean class
     		     
     		     
     		     
     		    Boolean b1 = new Boolean(true); // instantiation of boolean b1
     		    Boolean b2 = new Boolean(false);
                String s1 = "true"; 
     		    Boolean equality = b1.equals(b2); // to check equality
     		    System.out.println("b and b2 are the same" +equality) ;
     		    System.out.println("the hashcode of b1 is" + b1.hashCode()); // prints the hashcode value of the boolean true
     		    System.out.println("the parse boolean of s1 is " + Boolean.parseBoolean(null)); 
     		   
     		    		
     		
     		     
     		 
       	  
    		   
    		}
    		   
    		   }

