package Package2;

import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


///9.-Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del usuario en kilogramos y 
///la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario. Muestre además la siguiente información del Departamento 
///de Salud y Servicios Humanos/Instituto Nacional de Salud para que el usuario pueda evaluar su BMI: 							
///VALORES DE BMI
///Bajo peso:menos de 18.5 
///Normal: entre 18.5 y 24.9 
///Sobrepeso:entre 25 y 29.9 
///Obeso: 30 o más 
        
		double peso ;
		double altura;
		double indcorporal;
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresar tu peso");
		peso = sc.nextDouble();
		System.out.println("Ingresar tu altura");
		altura = sc.nextDouble();
		indcorporal = peso / (altura * altura);
		System.out.println("El indcorporal es: "+indcorporal);
		
		if (indcorporal < 18.5);
		{
			System.out.printf("bajo peso");
		}
		
		if (indcorporal >= 18.5 && indcorporal <= 24); 
		{
			System.out.printf("normal");
		}
		
		if (indcorporal >= 25 && indcorporal <= 29.9);
		{
			System.out.printf("sobrepeso");
		}
		if (indcorporal > 30);
		{
			System.out.printf("obeso");
		}
		
		
		
		
		
	}

}
