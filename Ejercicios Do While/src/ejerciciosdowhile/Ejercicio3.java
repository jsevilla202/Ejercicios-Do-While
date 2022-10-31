package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n = 0, suma = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("El programa va a sumar todos los número anteriores hasta el número introducido"
				+ "\nEj: Introduce: 5 Respuesta: 15(1+2+3+4+5)");
		System.out.print("Introduzca un número: ");
		n = sc.nextInt();
		
		do {
			suma = suma + n;
			n = n-1;
		}
		while(n>0);
		
		System.out.println(suma);
		
		sc.close();
	}

}
