package beecrowd;
import java.util.Arrays;
import java.util.Scanner;


public class simple_classification_1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int [3];
		int copyArray[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
			copyArray[i] = array[i];
		}
		
		Arrays.sort(array);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < 3; i++) {
			System.out.println(copyArray[i]);
		}
	}

}
