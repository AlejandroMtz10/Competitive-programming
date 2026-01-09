package beecrowd;
import java.util.Scanner;
public class functions_1555 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0, rafael = 0, beto = 0, carlos = 0;
        int n = sc.nextInt();

        int [][]test_cases = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                test_cases[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                if(j == 0){
                    x = test_cases[i][j];
                } else {
                    y = test_cases[i][j];
                }

                if (x != 0 && y != 0){
                    rafael = (3 * x);
                    rafael = (rafael * rafael) + (y * y);

                    beto = (5 * y);
                    beto = (2 * (x * x)) + (beto * beto);

                    carlos = (-100 * x) + (y * y *y);

                    if(rafael > beto && rafael > carlos){
                        System.out.println("Rafael ganhou");
                    } else if (beto > rafael && beto > carlos) {
                        System.out.println("Beto ganhou");
                    }else {
                        System.out.println("Carlos ganhou");
                    }

                    x = 0;
                    y = 0;
                    rafael = 0;
                    beto = 0;
                    carlos = 0;
                }

            }
        }
    }
}