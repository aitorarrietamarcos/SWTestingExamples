package code;

public class EasyStringMethods {
	
	// Method to count the number of 'a's in a given string
    public static int countAs(String input) {
        int count = 0;
        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            // Check if the character is 'a' or 'A'
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

}
