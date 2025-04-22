package practica;

import java.util.ArrayList;

public class CalculosMatematicos {
	// Método para calcular el MCD usando el algoritmo de Euclides
	public void calcularMCD(int numA, int numB) {
	int a = numA, b = numB;
	while (b != 0) {
	int temp = b;
	b = a % b;
	a = temp;
	}
	System.out.println("El máximo común divisor de "+numA+ " y "+numB+" es " + a);
	}
	
	public CalculosMatematicos() {		
	}

	public void calculosRefactorizados(int numero) {
		
		
		// Calculamos los factoriales primos
		ArrayList<Integer> miArray = new ArrayList();
		boolean noEsPrimo = false;
		//Añadimos el 1
		miArray.add(1);
		
		noEsPrimo = calcularFactorialPrimo(numero, miArray, noEsPrimo);			
		
		System.out.println("Los factoriales primos del número introducido son: "+miArray);
		
		noEsPrimo = validarPrimo(numero, noEsPrimo);
		
		if(noEsPrimo) {
			System.out.println("El número "+numero+ " NO es primo");
		} else System.out.println("El número "+numero+ " SI es primo");
	}

	/**
	 * @param numero
	 * @param noEsPrimo
	 * @return
	 */
	private boolean validarPrimo(int numero, boolean noEsPrimo) {
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;			
			if(numero%i==0) {
				noEsPrimo = true;				
				i=numero;
			}
		}
		return noEsPrimo;
	}

	/**
	 * @param numero
	 * @param miArray
	 * @param noEsPrimo
	 * @return
	 */
	private boolean calcularFactorialPrimo(int numero, ArrayList<Integer> miArray, boolean noEsPrimo) {
		int j;
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;
			j = 2;
			while(j<i) {
				if(i%j==0) {
					noEsPrimo = true;
					j=i;				
				} else j++;
			}
			if(!noEsPrimo&&numero%i==0) {
				miArray.add(i);								
			}
			
		}
		return noEsPrimo;
	}			
}
