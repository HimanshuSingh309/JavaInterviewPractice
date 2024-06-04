package practice;

public class RemoveLeadingAllZero {
	
	public static String removeLeadingZeros(String input) {
        // Iterate through the input string until a non-zero character is found
		String output = "";
        int startIndex = 0;
        while (startIndex < input.length() && input.charAt(startIndex) == '0') {
            startIndex++;
        }
        
        for(int i =startIndex; i<=input.length()-1; i++ ) {
        	output += input.charAt(i);
        	
        	}
        return output;
        }
    public static void main(String[] args) {
        String input = "0000hsagfdghjsa0000234svadhj";
        
     // Check if input string is null or empty
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }

        // Check if all characters in input string are zero
        boolean allZeros = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0') {
                allZeros = false;
                break;
            }
        }
        if (allZeros) {
            System.out.println("All characters in input string are zero.");
            return;
        }
        
        String expOutcome = removeLeadingZeros(input);
       
        if (expOutcome.equals(input)) {
            System.out.println("No leading zero in given string.");
        } else {
            System.out.println(expOutcome);
        }
        
    }
}

