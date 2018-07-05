import java.util.Scanner;

public class VariableInput{

	public system void public static void main(String[] args) {
		
		int anInt;
		String aString;
		double aDouble;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		anInt = scanner.nextInt();
		System.out.print("Enter a string: ");
		aString = scanner.nextLine();
		System.out.print("Enter a floating point number: ");
		aDouble = scanner.nextDouble();

		System.out.println(anInt);
		System.out.println(aString);
		System.out.println(aDouble);
	}
}