/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorTotal, valorFabrica;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de fábrica = R$");
		valorFabrica = sc.nextFloat();
		
		valorTotal = (valorFabrica * 28 / 100) + (valorFabrica * 45 / 100) + valorFabrica;
		
		System.out.printf("Valor total do veículo = R$%.2f", valorTotal);		
	}

}
