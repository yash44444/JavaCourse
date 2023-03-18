package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(2);
		
		Set<Integer> newList = new HashSet<>(list);
		
		System.out.println(newList);
	}

}
