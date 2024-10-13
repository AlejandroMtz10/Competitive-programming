package beecrowd;

import java.util.*;

public class par_e_impar_1259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        // Reed the number
        int N = sc.nextInt();

        // arrays
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Reading the numbers and classify even or odd
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        // Sort even numbers from lowest to highest
        Collections.sort(even);

        // Sort odd numbers from highest to lowest
        Collections.sort(odd, Collections.reverseOrder());

        // Print even numbers
        for (int num : even) {
            System.out.println(num);
        }

        // Print odd numbers
        for (int num : odd) {
            System.out.println(num);
        }

        sc.close();
		
	}

}
