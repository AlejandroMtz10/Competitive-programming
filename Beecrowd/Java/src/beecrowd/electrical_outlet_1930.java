package beecrowd;

import java.util.Scanner;

public class electrical_outlet_1930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t1, t2, t3, t4, devices;
		
		t1 = sc.nextInt();
		t2 = sc.nextInt();
		t3 = sc.nextInt();
		t4 = sc.nextInt();
		
		devices = (t1+t2+t3+t4)-3;
		
		System.out.println(devices);
		
	}

}
