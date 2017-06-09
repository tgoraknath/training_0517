package com.datastructure;

import java.util.*;
public class EnumerationTester {



   public static void main(String args[]) {
      Enumeration<String> days;
      Vector<String> dayNames = new Vector<String>(); // instantiated a vector...
      
      int[] array = {10,20,30,40,50};
      //  shift by x positions...
      // write a funct to to test if all letters are same.
      // swap without temp
      // read about generics
      // source code
      dayNames.add("Sunday"); // added element to the vector 
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements(); // enumerated the daynames all in one 
      System.out.println("does sunday is included?"+ dayNames.contains("Sunday"));
      System.out.println("last element in the list"+ dayNames.lastElement()); 
      
      BitSet bits1 = new BitSet(16);// creating a bit obj
      BitSet bit = new BitSet(16);
      bits1.set(0); // adding bits 
      bits1.set(1);
      bit.set(1);
      bit.set(2);
      System.out.println("the bits in bits1 are" +bits1);
      System.out.println("the bits in bit are" +bit);
      bit.and(bits1);
      System.out.println("after and operation" +bit);
      bit.or(bits1);
      System.out.println("after or operation" +bit);
      System.out.println("number of elements in bit "+bit.length());
      System.out.println("is the bit empty" +bit.isEmpty());
      bit.clear();
      System.out.println("checking the emptiness of the bit after clear()" +bit.isEmpty());
      System.out.println(bit);
      
      
    
      boolean b = days.hasMoreElements();
      if (b)
        System.out.println(days.nextElement()); 
        System.out.println(dayNames.capacity());
         dayNames.clear();
        // System.out.println(dayNames.capacity())
       // System.out.println(dayNames.clone());
       // System.out.println(dayNames.contains("Sunday"));
         
         Stack<Integer> st = new Stack<>(); // lifo 
         st.push(1);
         st.push(2);
         st.push(3);
         st.push(4);
         st.push(5);
         
         System.out.println("stack :" +st);
        // st.push(bit);
         System.out.println("pushed elements in to stack" +st);
         st.pop();
         System.out.println("after popping bit "+st);
         System.out.println("Is stack empty? "+st.empty()); 
 
}
 
   }