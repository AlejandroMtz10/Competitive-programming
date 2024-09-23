package beecrowd;

import java.util.Scanner;

public class age_in_days_1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int days, months = 0, years = 0;
		
		days = sc.nextInt();
		
		if(days >= 365) {
			years = days / 365;
			
			days = days - (years * 365);
		}
		
		if(days >= 30 && days < 365) {
			months = days / 30;
			
			days = days - (months * 30);
		}
		
		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + " dia(s)");
	}

}
