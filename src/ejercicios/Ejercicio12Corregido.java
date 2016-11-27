//Ejercicio del ahortcado con subStrings
package ejercicios;

import java.util.Scanner;

public class Ejercicio12Corregido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra a adivinar");
		String adivinar = sc.next();
		int vidas = 10;
		String adivinando = "";
		boolean adivinado = false;
		for (int i=0;i<adivinar.length();i++) {
			adivinando+="_";
		}
		do {
			System.out.println(adivinando);
			System.out.println("Introduce una letra:");
			char letra = sc.next().charAt(0);
			for (int i=0;i<adivinar.length();i++) {
				if (adivinar.charAt(i) == letra) {
					adivinando = adivinando.substring(0, i) + letra + adivinando.substring(i+1);
				}
			}
			int i = 0;
			adivinado = true;
			while (adivinado && i < adivinando.length()) {
				if (adivinando.charAt(i) == '_') {
					adivinado = false;
				}
				i++;
			}
		} while ((vidas>0)&&(!adivinado));
		if (adivinado) {
			System.out.println("Felicidades! Has adivinado la palabra");
		} else {
			System.out.println("La palabra era: "+adivinando+", más suerte la próxima vez");
		}
		sc.close();

	}
}
