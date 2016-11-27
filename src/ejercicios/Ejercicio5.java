//Se calcula 2 elevado a "n", siendo "n" una potencia introducida por teclado
package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numUsuario;
		long solucion=1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor introduzca un numero");
		numUsuario = sc.nextInt();
		
		for(int i=1;i<=numUsuario;i++){
			solucion *= 2;
		}
		System.out.println("La solución es: "+solucion);
		sc.close();
	}

}
