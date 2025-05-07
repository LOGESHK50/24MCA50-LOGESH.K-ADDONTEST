package prb;
import java.util.Scanner;
public class Star_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();
        sc.close();

        int spaces = n / 2;
        for (int i = 1; i <= n; i += 2) {
            printSpaces(spaces);
            printStars(i);
            spaces--;
        }

        spaces = 1;
        for (int i = n - 2; i > 0; i -= 2) {
            printSpaces(spaces);
            printStars(i);
            spaces++;
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}