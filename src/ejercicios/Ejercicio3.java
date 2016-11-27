//Detectar si se ha introducido por teclado un numero par. De no se asi el programa tiene que pedirte un nuemro par de nuevo. Dejando al usuario 5 intentos de escribir un nuemro par
package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numIntentos=1;	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero par");
		int numUsuario = sc.nextInt();
		
		while((numUsuario%2!=0)&&(numIntentos<5)) {
			if(numUsuario%2!=0){
				System.out.println("Por favor introduzca un numero par");
				numIntentos=numIntentos + 1;
				numUsuario = sc.nextInt();
			}
		}
		
		System.out.println("No has introducido ningun numero par");
		
		sc.close();
	}

}