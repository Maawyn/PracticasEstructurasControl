//Lee un valor entero positivo por teclado y comprueba si éste contiene la cifra 5
package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String numUsuario;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número :3");
		numUsuario = sc.nextLine();
		if(numUsuario.contains("5")){
			System.out.println("Contiene el numero 5");
		}
		sc.close();
	}
}
