package tests.Lesson1;

public class Arrays {

	public static void main(String[] args) {
		
		
		// static array
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[3]);
		
		// or
		
		int[] array = {1,2,3,4,5};
		System.out.println(array[2]);
		
		
		// size of array using length method. length and length() are different in java. length() is used on string.
		System.out.println(arr.length);
		
		// print all values of array
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 *  Advantage: multiple values can be stored in a array variable.
		 *  Disadvantage: array have fixed size, it called static array.
		 *  Another problem is,  it accepts same data type only.
		 *  If i want to store address fields having int and string, array will not accept.
		 *  To overcome this. we use object array from Collections.
		 *  
		 * 
		 */

	}

}
