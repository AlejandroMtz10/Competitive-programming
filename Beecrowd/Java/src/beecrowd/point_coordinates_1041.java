package beecrowd;
import java.util.Scanner;

public class point_coordinates_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float x, y;
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		if(x == 0 && y == 0){
			System.out.println("Origem");
		}else if(x == 0 && y != 0){
			System.out.println("Eixo Y");
		}else if(y == 0 && x != 0){
			System.out.println("Eixo X");
		}else if(x > 0) {
			if(y > 0) {
				System.out.println("Q1");
			}else {
				System.out.println("Q4");
			}
		}else if(x < 0) {
			if(y > 0) {
				System.out.println("Q2");
			}else {
				System.out.println("Q3");
			}
		}
	}

}
