//Esto es un sumatorio que sigue la siguiente regla 1/n tantas veces sea i, e i siempre comienza en 0
package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numUsuario;
		int i;
		float solucion=0f;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el limite superior del sumatorio");
		numUsuario = sc.nextInt();
		
		for(i=0;i<=numUsuario;i++){
			solucion += 1/(float)numUsuario;		
		}
		System.out.println("Solucion: "+solucion);
		sc.close();
	}
}