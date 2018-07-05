import java.util.Scanner;

public class QuadraticSolutionExistsExercise {

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		int a,b,c;

		System.out.print("Enter a: ");
		a = sc.nextInt();

		System.out.print("Enter b: ");
		b = sc.nextInt();

		System.out.print("Enter c: ");
		c = sc.nextInt();

		boolean hasSolution = b*b-4*a*c>=0

	    System.out.print("It is ");
	    System.out.print(hasSolution);
	    System.out.print("that the equation 0=");
	    System.out.print(a);
	    System.out.print("*x^2 + ");
	    System.out.print(b);
	    System.out.print("*x + ");
	    System.out.print(c);
	    System.out.print(" has a solution");
	}
	
}