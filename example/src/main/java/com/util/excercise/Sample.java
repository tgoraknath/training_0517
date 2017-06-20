package com.util.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sample {

	public static void main(String[] args) {
		// List - interface/ds.. allows duplicates, nulls..dynamic array.. 
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
	    System.out.println("The size of the List is :" +intList.size());
	    System.out.println("The index is" +intList.indexOf(2));
	    System.out.println("The value at the index is :" +intList.get(0));
	    System.out.println("The index of last occurance :" +intList.lastIndexOf(2));
	    intList.set(2, 5);
	    System.out.println(intList);
	    intList.remove(0);
	    System.out.println(intList);
	    System.out.println("Is the list empty?   "+intList.isEmpty());
	    intList.addAll(intList);
	    System.out.println(intList);
	    intList.clear();
	    System.out.println(intList);
	    
		
      //  intList.    methods
	    // set ... will not allow duplicates.. allows only one null
		Set<Integer> intSet = new HashSet<Integer>();
		Set<Integer> intSet2 = new HashSet<Integer>();
		intSet2.add(1);
		intSet2.add(1);
		intSet2.add(5);
		intSet.add(2);
		intSet.add(1);
		intSet.add(5);
		System.out.println(intSet);
		System.out.println("Does the set contain '1' ?" +intSet.contains(1));
		Object[] x = intSet.toArray();
		System.out.println("without converting into string" +intSet.toArray());
		System.out.println(Arrays.toString(x));
		System.out.println("the sizeof the set is "+intSet.size());
	    //intSet.notify();
		//intSet.foreach();
		System.out.println(intSet.retainAll(intSet2)); 
		
		                                                      
		
	    Collection<Integer> collection = intSet; // set ,list 
		// Map- Key..key is unique
		// Hashmap is unsorted  treemap is sorted and it of more cost. 
	   collection.add(1);
	   collection.add(2);
	   collection.add(6);
	   System.out.println("elements in the collection are:" +collection);
	   System.out.println("does he collection contain 5? " +collection.contains(5));
	   System.out.println("the hash code is : " +collection.hashCode());
	 //  System.out.println(collection.spliterator());
	   System.out.println(Arrays.toString(collection.toArray()));
	 //  collection.
	    
		Map<String,ArrayList<String>> statesWithCities = new HashMap<>(); 
		ArrayList<String> cityList = new ArrayList<String>();
	
        cityList.add("SFO");
        cityList.add("LA");
        cityList.add("SanDiego");
        statesWithCities.put("Cities in CA", cityList);
            
        System.out.println(statesWithCities);
        System.out.println(statesWithCities.containsKey("Cities in CA"));
        System.out.println("the cities of CA are" +statesWithCities.values());
      
        TreeMap<Integer, String> treeMapCities = new TreeMap<Integer, String>();
		
        treeMapCities.put(10,"SFO");
        treeMapCities.put(102,"LA");
        treeMapCities.put(103,"SanDiego");
        System.out.println("The output of a Tree map before removing an element: " +treeMapCities);  
        treeMapCities.remove(102);
        System.out.println("The output of a Treemap map after removing an element " +treeMapCities);  
   
        
        HashMap<Integer, String> hashMapCities = new HashMap<Integer, String>();
        hashMapCities.put(10,"SFO");
        hashMapCities.put(102,"LA");
        hashMapCities.put(103,"SanDiego");
        System.out.println("The output of a hashmap map before removing an element: " +hashMapCities);  
        hashMapCities.remove(102);
        System.out.println("The output of a hashmap map after removing an element " +hashMapCities);  
        
		
		//Collections --> Has all static methods 
		//Collections.
		
	}

}
