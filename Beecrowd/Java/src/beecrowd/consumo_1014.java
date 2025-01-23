package beecrowd;

import java.util.Scanner;

public class consumo_1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// x is the distance
		// y is the fuel
		int x;
		float y;
		
		x = sc.nextInt();
		
		y = sc.nextFloat();
		
		System.out.printf("%.3f km/l\n", x/y);
	}

}
