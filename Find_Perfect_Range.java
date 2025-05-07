package prb;

public class Find_Perfect_Range {
    public static void main(String[] args) {
        System.out.print("Perfect numbers between 1 and 1000: ");
        for (int num = 1; num <= 1000; num++) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }
    }

    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}