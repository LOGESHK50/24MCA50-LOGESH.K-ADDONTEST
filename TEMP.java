package addontask;

import java.util.Scanner;

public class fahrenheit {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

	System.out.println("Input temperature in Fahrenheit: ");
	double F=sc.nextDouble();
	double C=(5/9.0)*(F-32);
	System.out.printf("Sample Output (for %.0f°F ):\n %.6f deg F is %.6f ",F,F,C);


		
	}
}

	