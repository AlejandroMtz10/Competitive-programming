package beecrowd;
import java.util.*;
public class rieles_1062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;

            while (true) {
                int[] order = new int[N];
                for (int i = 0; i < N; i++) {
                    order[i] = sc.nextInt();
                }

                if (order[0] == 0) {
                    break;
                }

                if (canArrange(order)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

	  private static boolean canArrange(int[] order) {
	        Stack<Integer> station = new Stack<>();
	        int nextExpected = 1;

	        for (int i = 0; i < order.length; i++) {
	            while (!station.isEmpty() && station.peek() == nextExpected) {
	                station.pop();
	                nextExpected++;
	            }

	            if (order[i] == nextExpected) {
	                nextExpected++;
	            } else if (!station.isEmpty() && station.peek() < order[i]) {
	                return false;
	            } else {
	                station.push(order[i]);
	            }
	        }

	        while (!station.isEmpty() && station.peek() == nextExpected) {
	            station.pop();
	            nextExpected++;
	        }

	        return station.isEmpty();
	    }
	}
