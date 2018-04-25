import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		double num1, num2, sum;
		char answer;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Enter a number : ");
			num1 = in.nextDouble();

			System.out.println("Enter another nunmber: ");
			num2 = in.nextDouble();

			sum = (num1 + num2);

			System.out.println("The sum is " + sum);
			System.out.println("Would you like to continue (y/n)?");

			answer = in.next().charAt(0);

		} while ((answer != 'n') && (answer != 'N'));
	}

}
