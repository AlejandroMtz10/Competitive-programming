package beecrowd;

import java.util.Scanner;

public class selectionTest1_1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((b > c) && (d > a) && (c+d > a+b) && (c >= 0 && d >= 0) && (a%2 == 0)){
            System.out.printf("Valores aceitos\n");
        }
        else{
            System.out.printf("Valores nao aceitos\n");
        }
	}

}
