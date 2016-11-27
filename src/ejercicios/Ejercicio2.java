//Calcula la suma y la media aritmética de los "n" primeros enteros. Solicitar el valor de  "n" por
//teclado. HECHO CON SUBPROGRAMACIÓN*
package ejercicios;

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int n = sc.nextInt();
		
		System.out.println("La suma de los " + n + " primeros numeros enteros es: " + suma(n) );
		System.out.println("La media aritmetica de los" + n + " numeros es: " + media(n) );
		
		sc.close();
	}
	private static int suma(int num){
		for(int i=num-1;i>0;i--){
			num +=i;
		}
		return num;
	}

	private static double media(int n){
		double division =(double) suma(n)/n;
		return division;
	}
}
