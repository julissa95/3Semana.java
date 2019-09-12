package Package10;

import java.util.Scanner;

public class exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///10.-Use Web para determinar la población mundial actual y la tasa de crecimiento anual de la población mundial. Escriba una aplicación que reciba 
///estos valores como entrada y luego muestre la población mundial estimada después de uno, dos, tres, cuatro y cinco años. 
		
		double poblacionmundial;
		double tasacrecimientoa;
		double crecimiento;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar la poblacion mundial");
		poblacionmundial = sc.nextDouble();
		System.out.println("Ingresar la tasa de crecimiento");
		tasacrecimientoa = sc.nextDouble();
		
		crecimiento=poblacionmundial * (tasacrecimientoa/100);
		poblacionmundial = poblacionmundial + crecimiento ;
		
		System.out.println("La poblacion mundial en un ano es: "+poblacionmundial);
		
		crecimiento=poblacionmundial * (tasacrecimientoa/100);
		poblacionmundial = poblacionmundial + crecimiento ;
		
		System.out.println("La poblacion mundial en 2 años  es: "+poblacionmundial);
		
		
		crecimiento=poblacionmundial * (tasacrecimientoa/100);
		poblacionmundial = poblacionmundial + crecimiento ;
		
		System.out.println("La poblacion mundial en 3 ano es: "+poblacionmundial);
		
		crecimiento=poblacionmundial * (tasacrecimientoa/100);
		poblacionmundial = poblacionmundial + crecimiento ;
		
		System.out.println("La poblacion mundial en 4 ano es: "+poblacionmundial);
		
		crecimiento=poblacionmundial * (tasacrecimientoa/100);
		poblacionmundial = poblacionmundial + crecimiento ;
		
		System.out.println("La poblacion mundial en 5 ano es: "+poblacionmundial);
		
		
		
	}

}
