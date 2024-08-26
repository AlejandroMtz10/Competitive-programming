package Beecrowd.Java;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class sand_and_diamonts_1069 {
        public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < N; i++) {
            String testCase = sc.nextLine();
            int diamondsExtracted = extractDiamonds(testCase);
            System.out.println(diamondsExtracted);
        }
    }
    
    public static int extractDiamonds(String testCase) {
        Stack<Character> stack = new Stack<>();
        int diamondsCount = 0;

        for (char c : testCase.toCharArray()) {
            if (c == '<') {
                stack.push(c);
            } else if (c == '>' && !stack.isEmpty() && stack.peek() == '<'){
                stack.pop();
                diamondsCount++;
            }
        }

        return diamondsCount;
    }
    
}