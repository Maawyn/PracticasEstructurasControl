//Realiza una division en la cual introduces por teclado el dividendo y el divisor, para calcularte la division mediante restas sucesivas y devolverte el cociente y el resto
package ejercicios;

import java.util.Scanner;
import java.lang.String;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numUsuario;
		int numUsuDivisor;
		Scanner num = new Scanner (System.in);
		System.out.println("Introduzca el número que quiere dividir");
		numUsuario = num.nextInt();
		String numCadena = String.valueOf(numUsuario); // numUsuario pasa a ser un String llamado numCadena y ya se podrá trabajar con él como cadena.
		System.out.println("Ahora introduzca el numero divisor");
		numUsuDivisor = num.nextInt();
		num.close();
		
		String seccionDividendo = ""; //las comillas crean un String vacio.
		String coeficiente = "";
		for(int i=0;i<numCadena.length();i++){
			seccionDividendo += numCadena.charAt(i);
			if(Integer.valueOf(seccionDividendo) == 0){
				coeficiente += '0';
				
			}
			if(Integer.valueOf(seccionDividendo) < numUsuDivisor){ //si pasa esto, se salta la division (las tres lineas de abajo, y termina la operacion.
				continue;
			}
			int resultado = Integer.valueOf(seccionDividendo) / numUsuDivisor; //division primera 
			coeficiente += String.valueOf(resultado); //agregas resultado al coeficiente final
			seccionDividendo = String.valueOf(Integer.valueOf(seccionDividendo) - (resultado* numUsuDivisor)); //Se calcula el resto mediante una resta	
		}
		System.out.println("El resultado es: "+coeficiente);
		System.out.println("El resto es: " + seccionDividendo);
	}
}

