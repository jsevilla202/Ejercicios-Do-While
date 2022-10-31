package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int n = 0, aleatorio;
		
		aleatorio = (int) (Math.random()*100);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación piensa un número, el programa irá mostrando números y se le indicará con:"
				+"\nO: Menor que el número del programa"+"\n1: Mayor que el número del programa"+"\n2: Igual que el número del programa");
		
		do {
			System.out.print("¿El número que has pensado es: "+aleatorio+"? ");
			n = sc.nextInt();
			
			if(n==0) {
			}
			if(n==1) {
			}
		}
		while(n!=2);
		
		sc.close();
	}

}
