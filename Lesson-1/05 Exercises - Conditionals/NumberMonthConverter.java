import java.util.Scanner;

public class NumberMonthxConverter {

	public static void public static void main(String[] args) {
		
		System.out.print("Enter a month: ");

		Scanner sc = new Scanner(System.in);

		String day;
		day = sc.next();

		int num;

		if(day.equals("Monday"))
			num = 1;
		else if(day.equals("Tuesday"))
			num = 2;
		else if(day.equals("Wednesday"))
			num = 3;
		else if(day.equals("Thursday"))
			num = 4;
		else if(day.equals("Friday"))
			num = 5;
		else if(day.equals("Saturday"))
			num = 6;
		else if(day.equals("Sunday"))
			num = 7;

		System.out.print(num);

	}

}