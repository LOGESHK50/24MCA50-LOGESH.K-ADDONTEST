package prb;
import java.util.Arrays;
public class Find_Second_large_no {

	public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 40,30};
        
        Arrays.sort(arr);
        System.out.println("Second largest no = " + arr[arr.length - 2]);
    }
}