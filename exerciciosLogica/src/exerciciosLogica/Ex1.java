/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int idade, meses, dias;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		meses = idade * 12;
		dias = idade * 365;
		System.out.println("Idade em dias -> " + dias);
				

	}

}
