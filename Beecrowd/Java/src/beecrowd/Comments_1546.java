/*
  Problem: Comments
  ID: 1546
  Type: AD-HOC
*/

import java.io.IOException;
import java.util.Scanner;

public class Comments_1546 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner sc = new Scanner(System.in);
		
		int n = 0, k = 0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
		    k = sc.nextInt();
		    
		    for(int j = 0; j < k; j++){
		        int responsible = sc.nextInt();
		        
		        switch(responsible){
		            case 1:
		                System.out.println("Rolien");
		                break;
		            case 2:
		                System.out.println("Naej");
		                break;
		            case 3:
		                System.out.println("Elehcim");
		                break;
		            case 4:
		                System.out.println("Odranoel");
		                break;
		            default:
		                break;
		        }
		            
		    }
		}
		
		sc.close();
 
    }
 
}
