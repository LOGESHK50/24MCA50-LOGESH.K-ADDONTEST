package addontask;

import java.util.Scanner;

public class numberpyramid {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Lines? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

           
            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num++);
            }

            
            num -= 2;
            for (int l = 1; l < i; l++) {
                System.out.print(num--);
            }

          
            System.out.println();
        }

        sc.close();
    }
}
