package RecurionToLoop;
import java.util.Scanner;

public class recursionToLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, num = 0;
		System.out.println("Enter number: ");
		num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			sum += i;
		}

		System.out.println(sum);

	}
}