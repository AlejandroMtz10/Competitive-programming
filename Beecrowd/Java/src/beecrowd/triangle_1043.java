package beecrowd;
import java.util.Scanner;
public class triangle_1043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if(a < (b+ c) && b < (a + c) && c < (a + b)) {
			System.out.printf("Perimetro = %.1f\n",(a + b + c));
		}else {
			System.out.printf("Area = %.1f\n",((c *(a + b))/2));
		}
	}

}
