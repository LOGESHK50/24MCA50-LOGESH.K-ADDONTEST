package addontask;
import java.util.Scanner;
public class coloranalysis {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter Color code character: ");
			char colour = scanner.next().charAt(0); // read first character input

			String colorName;

			switch (Character.toLowerCase(colour)) {
				case 'r':
					colorName = "RED";
					break;
				case 'g':
					colorName = "GREEN";
					break;
				case 'b':
					colorName = "BLUE";
					break;
				default:
					colorName = "BLACK";
					break;
			}

			System.out.println("Color Code " + colour + " is " +colorName);

			scanner.close();
		}
	}


