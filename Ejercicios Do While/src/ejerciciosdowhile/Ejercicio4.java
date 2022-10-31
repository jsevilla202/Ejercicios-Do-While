package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int n, i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El programa va a crear una tabla de multiplicar hasta el 10, con la respuesta, del número que introduzca");
		System.out.print("Introduzca un número: ");
		n = sc.nextInt();
		
		do {
			i++;
			System.out.println(n+" x "+i+" = "+n*i);
		}
		while(i<10);

	}

}
