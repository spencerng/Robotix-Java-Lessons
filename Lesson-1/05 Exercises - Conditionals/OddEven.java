import java.util.Scanner;

public class OddEven {

	public static void public static void main(String[] args) {
		
		System.out.print("Enter a number: ");

		Scanner sc = new Scanner(System.in);

		int num;
		num = sc.nextInt();

		boolean isEven = num % 2 ==  0

		System.out.print(num);
		System.out.print(" is ");

		if(isEven){
			System.out.println("even.");
		} 
		else System.out.println("odd.");
	}

}