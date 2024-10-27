package beecrowd;

import java.util.Scanner;

public class the_greatest_1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, greatest;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		greatest = a;
		if(a < b || a < c){
			if(b < c){
				greatest = c;
			}else{
				greatest = b;
			}
		}

		System.out.printf("%d eh o maior\n", greatest);
		
	}

}
