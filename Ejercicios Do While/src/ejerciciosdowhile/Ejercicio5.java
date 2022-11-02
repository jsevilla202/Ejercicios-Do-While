package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como numeros enteros:
		 * n: Respuesta del usuario que se usara para indicar si el número es mayor, menor o igual
		 * aleatorio: Número aleatorio generado
		 */
		int n = 0, aleatorio, min = 0, max = 101;
		
		//Generamos el número random
		aleatorio = (int) (Math.random()*100);
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y como funciona
		System.out.println("A continuación piensa un número, el programa irá mostrando números y se le indicará con:"
				+"\nO: Menor que el número del programa"+"\n1: Mayor que el número del programa"+"\n2: Igual que el número del programa");
		
		//Creamos un búcle en el cual para salir tiene que insertar "2"
		do {
			//pedimos al usuario que introduzca los valores definidos anteriormente para usar el programa
			System.out.print("¿El número que has pensado es: "+aleatorio+"? ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "n"
			n = sc.nextInt();
			
			//Si el usuario introduce 0, el número mostrado será mayor que el pensado
			if(n==0) {
				 max = (int) Math.floor(aleatorio);
				aleatorio = (int) Math.floor(Math.random() * (max - min) + min);
			}
			//Si el usuario introduce 1, el número mostrado será menor que el pensado
			if(n==1) {
				min = (int) Math.ceil(aleatorio);
				aleatorio = (int) Math.floor(Math.random() * (max - min) + min);
			}
			
			/*
			 * Usar Math.ceil es para indicar el número más alto e ir reduciendo el rango
			 * Usar Math.floor es para indicar el número más bajo e ir reduciendo el rango 
			 */
		}
		while(n!=2);
		System.out.println("Lo he acertado!!!!");
		sc.close();
	}

}
