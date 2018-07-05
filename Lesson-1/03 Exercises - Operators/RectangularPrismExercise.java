import java.util.Scanner;

public class RectangularPrismExercise {

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		int length, height, width;

		System.out.print("Enter height: ");
		height = sc.nextInt();

		System.out.print("Enter length: ");
		length = sc.nextInt();
		
		System.out.print("Enter width: ");
		width = sc.nextInt();

		System.out.print("Surface area: ");
		System.out.println(2*(width*height+width*length+length*height));
		
		System.out.print("Volume: ");
		System.out.println(height*width*length);
	}
	
}