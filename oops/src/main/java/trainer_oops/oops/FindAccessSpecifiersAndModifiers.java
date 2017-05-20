package trainer_oops.oops;

import java.util.Map;

/**
 * Below class has issues, identify all of them and add comment to each of it.
 * 1. what is the issue and how to fix it.
 * @author gtulla
 *
 */

public class FindAccessSpecifiersAndModifiers {
	public static Map<String, String> myMap;
	private FindAccessSpecifiersAndModifiers() {
		
	}
	public void add(String key, String value) {
		myMap.put(key, value);
	}
	public String get(String key) {
		return myMap.get(key);
	}
	public static String find(String key) {
		return FindAccessSpecifiersAndModifiers.find(key);
	}

}
