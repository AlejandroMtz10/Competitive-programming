package beecrowd;

import java.util.Scanner;

public class gangorra_2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int p1, c1, p2, c2;
		
		p1 = sc.nextInt();
		
		c1 = sc.nextInt();
		
		p2 = sc.nextInt();
		
		c2 = sc.nextInt();
		
		p1 = p1 * c1;
		
		p2 = p2 * c2;
		
		if(p1 == p2) {
			System.out.println("0");
		}else if(p1 < p2) {
			System.out.println("1");
		}else {
			System.out.println("-1");
		}
		
		
	}

}
