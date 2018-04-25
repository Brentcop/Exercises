import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double num;
		char answer;

		do {
			System.out.println("Enter a number : ");
			num = in.nextDouble();
			num = 0.5 + num;
			System.out.println(num);

			System.out.println("Would you like to continue (y/n)? ");
			answer = in.next().charAt(0);

		} while ((answer != 'n') && (answer != 'N'));
	}

}
