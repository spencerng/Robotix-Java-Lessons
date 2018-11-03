import java.util.Scanner;

public class BinaryConverterSol {
	
	public static void main(String[] args){	
		
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++){
			
			String binaryNum = sc.next();
			
			int value = 0;
			int power = 0;
			for(int j = binaryNum.length()-1; j >= 0; j--){
				if(binaryNum.charAt(j)=='1'){
					value+=Math.pow(2, power);
				}
				power++;
			}
			
			System.out.println(binaryNum + " in decimal is " + value);			
			
		}
			
		
	}

}