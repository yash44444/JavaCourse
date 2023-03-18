package tests;

import java.util.ArrayList;
import java.util.List;

public class MinMaxList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(7);

		int min = list.get(0);
		int max = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			int value = list.get(i);
			if (value < min) {
				min = value;
			}
			if (value > max) {
				max = value;
			}
		}
		System.out.println(min);
		System.out.println(max);

	}
	
	/* Other way is to use collection methods
	   Collections.min(myList)
	   Collections.max(myList)
	*/

}
