import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double num1, num2, sum;
		char answer;

		do {
			System.out.println("Enter a number: ");
			num1 = in.nextDouble();

			System.out.println("Enter another number: ");
			num2 = in.nextDouble();

			sum = (num1 * num2);

			System.out.println("The product is :" + sum);

			System.out.println("Would you like to continue (y/n)?");
			answer = in.next().charAt(0);

		} while ((answer != 'n') && (answer != 'N'));
	}

}
