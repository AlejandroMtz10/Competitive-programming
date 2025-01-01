/*
 * Distance between two points 1015
 * By Alejandro Martinez
 * January 01, 2024
 * 
 * Test case
 * Input:	
 * 1.0 7.0
 * 5.0 9.0
 * Output
 * 4.4721
 * 
 * */
package beecrowd;

import java.util.Scanner;

public class distanceBetween_twoPoints_1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// "d" is distance
		double x1, y1, x2, y2, d, x, y;
		
		// Read first point
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		// Read second point
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		x = x2 - x1;
		x = Math.pow(x, 2);
		
		y = y2 - y1;
		y = Math.pow(y, 2);
		
		d = x + y;
		d = Math.sqrt(d);
		
		// Print with a newline at the end
		System.out.printf("%.4f\n", d);
		sc.close(); // Close scanner to avoid resource leaks
	}

}

