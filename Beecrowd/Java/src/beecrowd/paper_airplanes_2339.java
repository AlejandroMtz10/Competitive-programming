package beecrowd;

import java.util.Scanner;

public class paper_airplanes_2339 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int competitors, sheetsPur, sheetsComp, result;
		
		competitors = sc.nextInt();
		
		sheetsPur = sc.nextInt();
		
		sheetsComp = sc.nextInt();
		
		result = competitors * sheetsComp;
		
		result = sheetsPur/result;
		
		if(result >= 1) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
		
	}

}
