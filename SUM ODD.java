package addontask;

import java.util.Scanner;

public class sumofoddintegers {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter how many odd numbers to sum: ");
	        int n = scanner.nextInt();

	        int sum = 0;
	        int count = 0;
	        int current = 1;

	      
	        while (count < n) {
	            sum += current;
	            current += 2;
	            count++;
	        }

	        
	        System.out.println("Sum of first " + n + " odd numbers is " + sum);

	        scanner.close();
	    }
	}


