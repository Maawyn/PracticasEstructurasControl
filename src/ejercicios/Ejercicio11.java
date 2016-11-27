//*Escribe un programa que lea una serie de precios por teclado y calcule su suma y el IVA (21%)
//correspondiente. El programa considerará que se ha dejado de introducir precios cuando el
//valor leído sea igual a 0.
package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		final float IVA = 0.21f;
		float numUsuario;
		float resultado = 0;
		float iva = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un precio (Recuerda ponero los precios con coma y para acabar introduzca un 0)");
		numUsuario = sc.nextFloat();
		
		while(numUsuario != 0){
			resultado += numUsuario;
			System.out.println("Por favor, introduzca otro precio: ");
			numUsuario = sc.nextFloat();			
		}
		sc.close();
		System.out.println("La suma total es: " + resultado);
		iva = resultado*IVA;
		System.out.println("El IVA de esta cantidad es: " + iva);
	}
}
