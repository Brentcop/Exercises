import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {
		int number1;
		char answer;
		do {
 System.out.println("Enter a number: ");
 Scanner in = new Scanner(System.in);
 
 number1 = in.nextInt();
 number1++;
 
 System.out.println(number1);
 
 System.out.println("Do you want to continue(y/n)?");
	answer = in.next().charAt(0);

		}
while ((answer != 'n')&&(answer != 'N'));
	}

}
