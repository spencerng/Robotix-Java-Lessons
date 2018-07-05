import java.util.Scanner;

public class SchoolDaySol {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String month = sc.next();
		int date = sc.nextInt();
		String firstDay = sc.next();
		
		int firstDayNum = 0;
		
		if(firstDay.equals("Sunday"))
			firstDayNum = 0;
		else if(firstDay.equals("Monday"))
			firstDayNum = 1;
		else if(firstDay.equals("Tuesday"))
			firstDayNum = 2;
		else if(firstDay.equals("Wednesday"))
			firstDayNum = 3;
		else if(firstDay.equals("Thursday"))
			firstDayNum = 4;
		else if(firstDay.equals("Friday"))
			firstDayNum = 5;
		else if(firstDay.equals("Saturday"))
			firstDayNum = 6;
		
		//ignore July 4 because we'll test summer months later
		boolean isHoliday = month.equals("January")&&date==1 || month.equals("November") && date==11
				|| month.equals("December") && (date==24||date==25);
		
		int currentDayOfWeek=firstDayNum+(date-1); //go to new day of week
		currentDayOfWeek%=7; //conform it so that Sunday = 0, Saturday = 6
		
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		
		
		if(currentDayOfWeek>=1&&currentDayOfWeek<=5&&!month.equals("July")
				&&!month.equals("August")&&!isHoliday){
			System.out.println(" is a school day.");
		}
		
		else System.out.println(" is not a school day.");
		
	}
	
}