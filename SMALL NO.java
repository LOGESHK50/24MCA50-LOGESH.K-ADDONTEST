package addontask;
import java.util.Scanner;
public class smallestofnumbers {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter how many numbers you want to input: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Invalid input. Number of inputs must be greater than 0.");
	            return;
	        }

	        
	        System.out.print("Enter number 1: ");
	        int smallest = scanner.nextInt();

	        
	        for (int i = 2; i <= n; i++) {
	            System.out.print("Enter number " + i + ": ");
	            int current = scanner.nextInt();

	            if (current < smallest) {
	                smallest = current;
	            }
	        }

	        
	        System.out.println("The smallest number is: " + smallest);

	        scanner.close();
	    }
	}


