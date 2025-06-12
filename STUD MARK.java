package addontask;

import java.util.Scanner;

public class studentmarks {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter Mark 1:");
		double m1=sc.nextDouble();
		System.out.println("Enter Mark 2:");
		double m2=sc.nextDouble();
		System.out.println("Enter Mark 3:");
		double m3=sc.nextDouble();
		int total =(int) (m1+m2+m3);
		double Avg=(m1+m2+m3)/3.0;
		System.out.println("Total Marks = "+total);
		System.out.println("Average Marks = "+Avg);
		
	}
}
