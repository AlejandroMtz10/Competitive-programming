package beecrowd;
import java.io.IOException;
import java.util.Scanner;
public class promedio2_1006 {
        public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Leer las calificaciones (A, B y C)
        double A = sc.nextDouble();

        double B = sc.nextDouble();

        double C = sc.nextDouble();

        sc.close();

        // Calcular el promedio ponderado
        double media = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        // Imprimir el resultado
        System.out.printf("MEDIA = %.1f%n", media);

    }
    
}
