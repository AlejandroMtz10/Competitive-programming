package beecrowd;

import java.util.Scanner;

public class merry_chrismaaas_2483 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the index.
        int index = sc.nextInt();

        // Build the phrase.
        String phrase = "Feliz nat";

        // Bucle to duplicate the letter "a"
        for (int i = 0; i < index; i++) {
            phrase += "a";
        }

        // add the final part of the phrase
        phrase += "l!";

        // print the phrase completed
        System.out.println(phrase);

        sc.close();
    }
}
