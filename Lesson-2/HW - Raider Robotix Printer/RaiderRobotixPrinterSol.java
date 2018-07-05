import java.util.Scanner;

public class RaiderRobotixPrinterSol {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();

        for(int i = lowerLimit ; i<=upperLimit; i++){
            String s = "";
            
            if(i%3==0)
                s+="Raider";
            if(i%7==0)
                s+="Robotix";
            
            if(!s.equals(""))
                System.out.println(s);
            else System.out.println(i);
            
        }
    }
}