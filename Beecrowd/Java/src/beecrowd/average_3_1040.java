package beecrowd;

import java.util.Scanner;

public class average_3_1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

        System.out.printf("Media: %.1f\n", avg);

        if (avg >= 7){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (avg < 5){
            System.out.printf("Aluno reprovado.\n");
        }
        else{
            System.out.printf("Aluno em exame.\n");
            float score = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", score);
            float new_avg = (avg + score) / 2;
            if (new_avg >= 5){
                System.out.printf("Aluno aprovado.\n");
            }
            else{
                System.out.printf("Aluno reprovado.\n");
            }
            System.out.printf("Media final: %.1f\n", new_avg);
        }

        sc.close();
	}
}
