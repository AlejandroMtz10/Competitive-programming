package beecrowd;
import java.util.Scanner;
public class musical_loop_1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		
		do {
			N = sc.nextInt();
				if(N == 0) {
					break;
				}
			int[] magnitudes = new int[N];
            for (int i = 0; i < N; i++) {
                magnitudes[i] = sc.nextInt();
            }

            int picos = contarPicos(magnitudes);
            System.out.println(picos);
        
			
		}while(N != 0);

	}

    public static int contarPicos(int[] magnitudes) {
        int n = magnitudes.length;
        int picos = 0;

        for (int i = 0; i < n; i++) {
            int prev = magnitudes[(i + n - 1) % n];
            int curr = magnitudes[i];
            int next = magnitudes[(i + 1) % n];

            if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                picos++;
            }
        }

        return picos;
    }
}
