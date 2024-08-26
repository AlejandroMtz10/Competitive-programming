package Beecrowd.Java;
import java.io.IOException;
import java.util.Scanner;
public class identifying_tea_2006 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		int [] contestants = new int[5];
		int correctAnswer = 0;
		int teaType;		
		teaType = sc.nextInt();		
		for(int i = 0; i < 5; i++) {
			contestants[i] = sc.nextInt();
		}
		for(int j = 0; j < 5; j++) {
			if(teaType == contestants[j]) {
				correctAnswer++;
			}
		}
		System.out.println(correctAnswer);
    }
}