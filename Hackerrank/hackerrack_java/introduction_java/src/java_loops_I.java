import java.io.*;
import java.util.Scanner;

public class java_loops_I {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();

    }
}