import java.util.Scanner;

public class exercise7 {

	static char answer;

	public static void main(String[] args) {
		do {
			System.out.println("Enter some text: ");
			Scanner in = new Scanner(System.in);
			String text = in.nextLine();

			System.out.println("Would you like to continue (y/n)");
			answer = in.next().charAt(0);

		} while ((answer != 'n') && (answer != 'N'));
	}

}
