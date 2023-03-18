package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		// how to add in list. Duplicates allowed.
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("grape");
		list.add("apple");
		
		// how to traverse in list
		for(String fruits: list) {
			System.out.println(fruits);
		}
		
		// inserting element at a given index
		list.add(0, "lemon");
		System.out.println(list);
		
		// retrieving element from a given index
		list.get(3);
		
		// searching a fruit in the list
		if(list.contains("grape")){
			System.out.println("fruit found");
		}
		
		// sorting the list
		Collections.sort(list);
		System.out.println(list);
		
		// reversing the list
		Collections.reverse(list);
		System.out.println(list);
		
		// replace second element of ;list with the specified element.
		list.set(2, "peer");
		System.out.println(list);
		
		// checking if list is empty
		System.out.println(list.isEmpty());
		
		// comparing two lists
		List<String> newList = new ArrayList<>();
		
		newList.add("apple");
		newList.add("orange");
		newList.add("banana");
		newList.add("grape");
		newList.add("apple");
		
		if(list.equals(newList)) {
			System.out.println("list is equal");
		} else {
			System.out.println("list not equal");
		}
		

	}

}
