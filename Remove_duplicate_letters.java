package prb;
import java.util.Scanner;
public class Remove_duplicate_letters {
	
    public static void main(String[] args) {
        String input = "ADDONTESTT"; 
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (!result.contains(String.valueOf(c))) {
                result += c; 
            }
        }
        return result;
    }
}