package beecrowd;

import java.util.Scanner;

public class positive_numbers_1060 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        double numbers[] = new double[6];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }

        System.out.println(count + " valores positivos");
    }
}