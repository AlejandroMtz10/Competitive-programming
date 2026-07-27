package beecrowd;
import java.io.IOException;
import java.util.Scanner;

public class MultiplesOF13_1132 {

        public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, sum = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		int start = Math.min(x, y);
        int end = Math.max(x, y);
		
		for(int i = start; i <= end; i++){
            if(i%13 != 0){
                sum += i;
            }
		}
		
        sc.close();

		System.out.println(sum);
    }

}
