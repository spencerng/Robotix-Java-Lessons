import java.util.Scanner;

public class SteamworksExercise {

	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);

		int autoRotors, teleRotors, autoHigh, autoLow, 
			teleHigh, teleLow, baselineCrossCount, takeoffCount, foulPoints;

		int AUTO_ROTOR = 60, TELE_ROTOR = 40, BASELINE = 5, TAKEOFF=40;

		System.out.print("Autonomous rotors: ");
		autoRotors = sc.nextInt();

		System.out.print("Tele-op rotors: ");
		teleRotors = sc.nextInt();
		
		System.out.print("Autonomous high goals: ");
		autoHigh = sc.nextInt();

		System.out.print("Autonomous low goals: ");
		autoLow = sc.nextInt();
		
		System.out.print("Tele-op high goals: ");
		teleHigh = sc.nextInt();

		System.out.print("Tele-op low goals: ");
		teleLow = sc.nextInt();
		
		System.out.print("Baseline cross count: ");
		baselineCrossCount = sc.nextInt();

		System.out.print("Takeoff count: ");
		takeoffCount = sc.nextInt();

		System.out.print("Foul points: ");
		foulPoints = sc.nextInt();

		int score = AUTO_ROTOR*autoRotors+teleRotors*TELE_ROTOR
			+BASELINE*baselineCrossCount+TAKEOFF*takeoffCount+foulPoints
			+autoHigh+autoLow/3+teleHigh/3+teleLow/9;

	    System.out.print("Score: ");
	    System.out.println(score);
	}
	
}