import java.util.Scanner;

public class java_stdin_and_stdout_II {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int numInt = sc.nextInt();
        double numDouble = sc.nextDouble();
        sc.nextLine();
        String textString = sc.nextLine();

        System.out.println("String: " + textString);
        System.out.println("Double: " + numDouble);
        System.out.println("Int: " + numInt);

        sc.close();
    }
}
