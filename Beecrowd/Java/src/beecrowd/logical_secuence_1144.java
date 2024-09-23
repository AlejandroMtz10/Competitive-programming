package beecrowd;
import java.util.Scanner;
public class logical_secuence_1144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int square = i * i;
            int cube = i * i * i;
            
            System.out.println(i + " " + square + " " + cube);
            System.out.println(i + " " + (square + 1) + " " + (cube + 1));
        }
        
        
	}

}
