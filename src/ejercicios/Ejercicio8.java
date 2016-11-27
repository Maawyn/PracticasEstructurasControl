//Escribe un programa que lea un número entero positivo "n" y calcule, para cada múltiplo "m" de "n"
//menor que 100, el producto de todos los impares menores que "m".
package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int numUsuario;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero: ");
		numUsuario = sc.nextInt();
		if(numUsuario <= 0){
			sc.close();
			return;
		}
		for(int m=1;m<100;m++){
			if(m%numUsuario == 0){ //valores de m
				System.out.println();
				System.out.print(m+": ");
				int resultado=1;
				for(int i=1;i<m;i++){
					if(i%2 != 0){
						resultado *= i;
						if(resultado <= 0){
							continue;
						}
						System.out.print(resultado + ", ");
					}
				}
			}
		}
		sc.close();
	}
}
