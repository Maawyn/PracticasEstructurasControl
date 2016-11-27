//Calcular el factorial de un numero introducido por teclado
package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int resultado = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int numUsuario = sc.nextInt();
		
		for(int i=1;i<=numUsuario;i++){	
			resultado *= i;
		}
		
		System.out.println("El resultado es: " + resultado);
		sc.close();
	}

}
