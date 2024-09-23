package beecrowd;

import java.util.Scanner;

public class secuencia_secreta_3048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tam,apuntador, total = 0, anterior = 0;
		
		tam = sc.nextInt();
		
		int sequence[] = new int[tam];
		
		for(int i = 0; i < sequence.length; i++) {
			sequence[i] = sc.nextInt();
		}
		
		for(int j = 0; j < sequence.length; j++) {
			
			apuntador = sequence[j];
			
			if (apuntador == 1) {
				if(apuntador == anterior) {
					anterior = apuntador;
				}else if (apuntador != anterior) {
					anterior = apuntador;
					total++;
				}
				
			}else if(apuntador == 2) {
				if(apuntador == anterior) {
					anterior = apuntador;	
				}else if(apuntador != anterior) {
					anterior = apuntador;
					total++;
				}
				
			}
			
		}
		
		System.out.println(total);

	}

}
