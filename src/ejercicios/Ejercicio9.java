//Suma de todos los dijitos de un numero introducido por teclado
package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int numUsuario;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero: ");
		numUsuario = sc.nextInt();
		if(numUsuario <= 0){
			sc.close();
			return;
		}
		String cadena = String.valueOf(numUsuario);
		int resultado = 0;
		for(int i=0;i<cadena.length();i++){
			resultado +=Integer.valueOf(String.valueOf(cadena.charAt(i)));
		}
		System.out.println("La suma de todos los dígitos es: " + resultado);
		sc.close();
	}
}
