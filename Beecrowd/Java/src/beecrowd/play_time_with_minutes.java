package beecrowd;

import java.util.Scanner;

public class play_time_with_minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int hr_initial = sc.nextInt();
        int min_initial = sc.nextInt();
        int hr_final = sc.nextInt();
        int min_final = sc.nextInt();

        int startMinutes = hr_initial * 60 + min_initial;
        int endMinutes = hr_final * 60 + min_final;

        if (startMinutes == endMinutes) {
            // 24 hours
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if (endMinutes < startMinutes) {
                endMinutes += 24 * 60; // Add 24 hours in minutes
            }

            int duration = endMinutes - startMinutes;
            int hours = duration / 60;
            int minutes = duration % 60;

            System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
        }
	}

}
