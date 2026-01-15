package beecrowd;
import java.util.Scanner;
public class i_am_toorg_2581 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nQuestions = 0;
        nQuestions = sc.nextInt();

        String []questions = new String[nQuestions];

        for(int i = 0; i < nQuestions; i++){
            questions[i] = sc.next();
        }

        for(int i = 0; i < nQuestions; i++){
            System.out.println("I am Toorg!");
        }
    }
}
