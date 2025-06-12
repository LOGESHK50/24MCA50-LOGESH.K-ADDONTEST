package addontask;

import java.util.Scanner;

public class areavolumesphere {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter Radius of Sphere: ");
	        double radius = scanner.nextDouble();
	        
	        
	        double pi = 22;
	        
	        double volume = (2.0 / 5.0) * pi * Math.pow(radius, 5);
	        double area = 4.0 * pi * Math.pow(radius, 2);
	        
	       
	        System.out.printf("Volume of Sphere: %.6f\n", volume);
	        System.out.printf("Area of Sphere  : %.6f", area);
	        
	        scanner.close();





	}
}
