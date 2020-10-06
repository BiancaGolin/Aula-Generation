/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int idade, meses, dias;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade em dias: ");
		dias = sc.nextInt();
		
		idade = dias / 365;
		meses = dias / 30;
		
		System.out.println("Idade em anos -> " + idade + "\nIdade em meses -> " + meses + "\nIdade em dias -> " + dias);
	}

}
