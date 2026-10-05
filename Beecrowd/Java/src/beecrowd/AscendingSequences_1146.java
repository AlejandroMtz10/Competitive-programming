package beecrowd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AscendingSequences_1146 {
 
    public static void main(String[] args) throws IOException {
        // BufferedReader to read the input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = br.readLine()) != null) {
            int x = Integer.parseInt(line.trim());
            
            if (x == 0) {
                break;
            }
            
            // StringBuilder to save the line in memomry
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= x; i++) {
                sb.append(i);
                if (i != x) {
                    sb.append(" ");
                }
            }
            
            // Print the line
            System.out.println(sb.toString());
        }
    }
}
