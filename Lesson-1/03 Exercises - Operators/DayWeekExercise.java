import java.util.Scanner;

public class DayWeekExercise {

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		int desiredDay, firstDay;

		System.out.print("Day of the week of the first day of the month (1=Monday, 7=Sunday): ");
		firstDay = sc.nextInt();
		System.out.print("Day you want the day of the week for: ");
		desiredDay = sc.nextInt();

		System.out.print("The day of the week of Day ");
		System.out.print(desiredDay);
		System.out.print(" of the month is ");
		System.out.print((desiredDay+firstDay-2)%7+1);
	}
	
}