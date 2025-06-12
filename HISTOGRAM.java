package addontask;

import java.util.Scanner;

public class histogram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value:");
		int n=sc.nextInt();
		long j=1;
		System.out.println("\nN  |  Factorial ");
		System.out.println("---------------------");
		
		for(int i=1;i<=n;i++) {
			j*=i;
			System.out.printf("%-3d| %12d%n",i,j);
			
		}
		
	}
	
}
