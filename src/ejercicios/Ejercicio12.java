//Implementa el juego del ahorcado. El usuario introducirá una palabra y otro jugador deberá
//adivinarla, introduciendo letras consecutivamente. El jugador dispondrá de un total de 10
//intentos para adivinar la palabra. Si pasados esos 10 intentos no ha acertado, el juego
//terminará. Como pista, el programa deberá mostrar cada letra adivinada, sustituyendo con un
//‘_’ aquellas letras que faltan por adivinar.
package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String solucion = "";
		String respuesta = "";
		
		//String cadena = "pepe";
		//char pepe[] = {'p','e','p','e'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra: ");
		solucion = sc.nextLine();
		for(int i=0;i<solucion.length();i++){
			respuesta += '_';
		}
		System.out.println(respuesta);
		while(!respuesta.equals(solucion)){
			System.out.println("Introduzca una letra: ");
			char introducido = sc.next().charAt(0);
			
			if(solucion.contains(String.valueOf(introducido))){ //Solo comprueba si la cadena CONTIENE ese fragmento de otra cadena
				
				for(int contador=0;contador<solucion.length();contador++){
					
					if(solucion.charAt(contador) == introducido){ //Comprueba en qué posicion está el caracter de la otra cadena
						char respuestaDescompuesta[] = respuesta.toCharArray(); //respuesta.toCharArray(); está descomponiendo la cadena "respuesta" en sus elementos (en este caso caracteres)
						//char indica de que tipo van a ser los elementos dentro del array.
						respuestaDescompuesta[contador] = introducido; //[contador] -> posicion en el array. Toda la linea significa: la posicion en el array respuestaDescompuesta se va a sustituir por "introducido".
						respuesta = String.valueOf(respuestaDescompuesta);
					}
				}
			}
			
			System.out.println(respuesta);
		}
		System.out.println("Felicidades, has ganado");
		sc.close();
	}
}
