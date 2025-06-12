package addontask;

import java.util.Scanner;

public class cumulativeproduct {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int count = scanner.nextInt();

		double product = 1.0;

		for (int i = 1; i <= count; i++) {
			System.out.print("Enter number " + i + ": ");
			double num = scanner.nextDouble();
			product *= num;
		}

		System.out.printf("Cumulative Total = %.6f%n", product);

		scanner.close();
	}
}

