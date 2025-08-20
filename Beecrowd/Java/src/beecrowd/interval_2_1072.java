package beecrowd;

import java.util.Scanner;

public class interval_2_1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int interval_in = 0, interval_out = 0;
		int nCases = sc.nextInt();
		
		int cases[] = new int[nCases];
		
		// read the test cases
		for(int i = 0; i<= nCases -1; i++) {
			cases[i] = sc.nextInt();
		}
		
		// analize the interval cases
		for(int i = 0; i<= nCases -1; i++) {
			if(cases[i] >= 10 && cases[i] <= 20) {
				interval_in +=1;
			}else {
				interval_out+=1;
			}
		}
		
		System.out.println(interval_in + " in");
		System.out.println(interval_out + " out");
		
	}

}
