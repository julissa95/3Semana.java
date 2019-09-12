package Package7;

import java.util.Scanner;

public class exo7grosojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7-Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π.
		
		// C = 2pi R
		// D = 2R
		// S = PI R Carre
		int radio ;
		int diametro;
		double circonferencia;
		double aera;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar el radio");
		radio = sc.nextInt();
		
		diametro = 2 * radio;
		circonferencia = 2 * 3.14 * radio;
		aera = 3.14 * (radio * radio);
		
		System.out.println("El diametro es: "+diametro);
		System.out.println("La circonferencia es: "+circonferencia);
		System.out.println("La aera es: "+aera);
		
		
		
		

	}

}
