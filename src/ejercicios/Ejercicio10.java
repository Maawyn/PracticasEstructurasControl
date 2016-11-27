//Crear una matriz de n elementos (siendo n introducido por teclado) formando la diagonal principal con - la parte superior a la diagonal con + y la parte inferior a la diagonal con *
package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numUsuario;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero");
		numUsuario = sc.nextInt();
		
		for(int i=1;i<=numUsuario;i++){ //
			System.out.println("");
			for(int j=1;j<=numUsuario;j++){
				if(i==j){
					System.out.print("- ");
				}
				if(i<j){
					System.out.print("+ ");
				}
				if(i>j){
					System.out.print("* ");
				}
			}
		}
		sc.close();
	}
}

//* - + + + + 
//  * - + + + 
//  * * - + + 
//  * * * - + 
//  * * * * - 

