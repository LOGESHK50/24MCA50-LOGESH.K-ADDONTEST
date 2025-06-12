package addontask;

public class sumofevenintegers {

	    public static void main(String[] args) {
	        int sum = 0;

	        
	        for (int i = 2; i <= 30; i++) {
	           
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }

	        
	        System.out.println("Sum of even numbers from 2 to 30 = " + sum);
	    }
	}


