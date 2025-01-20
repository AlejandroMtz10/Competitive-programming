package beecrowd;

import java.util.Scanner;

public class corrida_2416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int distanceM, lengthM, bottle;
		
		distanceM = sc.nextInt();
		
		lengthM = sc.nextInt();
		
		bottle = distanceM % lengthM;
		
		System.out.println(bottle);

	}

}
