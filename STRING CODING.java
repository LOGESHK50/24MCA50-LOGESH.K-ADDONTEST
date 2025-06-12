package addontask;

import java.util.Scanner;

public class simplestringencodinng {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a Five letter word: ");
	        String word = scanner.nextLine();

	        
	        if (word.length() != 5) {
	            System.out.println("Error: Please enter exactly five letters.");
	            scanner.close();
	            return;
	        }

	        StringBuilder encoded = new StringBuilder();

	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);
	            char encodedChar = (char)(ch - 1);
	            encoded.append(encodedChar);
	        }

	        
	        System.out.println("Encoded Word: " + encoded.toString());

	        scanner.close();
	    }
	}

	

