package Beecrowd.Java;

import java.io.IOException;
import java.util.Scanner;

public class busca_na_internet {
        public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

        int thirdLink, firstLink;
        
        thirdLink = sc.nextInt();

        firstLink = thirdLink * 4;
        
        System.out.println(firstLink);
    }
}
