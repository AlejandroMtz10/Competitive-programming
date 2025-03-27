package beecrowd;

import java.util.Scanner;

public class conversion_time_1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int hours = n / 3600;
        int res = n % 3600;
        int min = res / 60;
        int sec = res % 60;

        System.out.println(hours + ":" + min + ":" + sec);
        sc.close();
		
	}

}
