import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		char answer;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Hello, World!");
			System.out.println("Would you like to continue (y/n)?");
			answer = in.next().charAt(0);
			
		}
		while ((answer != 'n')&& (answer != 'N'));
	}

}
