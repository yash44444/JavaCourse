package tests;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "hello world";
	        String output = removeDuplicateChars(input);
	        System.out.println(output);
	    }

	    public static String removeDuplicateChars(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            String currentChar = Character.toString(str.charAt(i));
	            if (sb.indexOf(currentChar) == -1) {
	                sb.append(currentChar);
	            }
	        }
	        return sb.toString();

	}

}
