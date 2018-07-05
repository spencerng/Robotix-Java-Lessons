import java.util.Scanner;

public class FeetYardConverter {

	public static void public static void main(String[] args) {
		
		System.out.println("1) Feet to Yards");
		System.out.println("2) Yards to Feet");
		System.out.println("Enter your choice (1 or 2): ");

		Scanner sc = new Scanner(System.in);

		int choice;
		choice = sc.nextInt();

		if(choice==1){
			System.out.print("Enter the number of feet: ");
			int feet = sc.nextInt();
			System.out.print(feet);
			System.out.print(" feet is ");
			System.out.print(feet/3.0);
			System.out.print(" yards");
		}
		else{
			System.out.print("Enter the number of feet: ");
			int yards = sc.nextInt();
			System.out.print(yards);
			System.out.print(" yards is ");
			System.out.print(feet*3);
			System.out.print(" feet");
		}
	}

}