/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float n1, n2, n3, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as 3 notas: ");
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		
		media =  (float) (((n1 * 2.3) + (n2 * 5) + (n3 * 3)) / (2.3 + 5 + 3));
		
		System.out.printf("Média = %.2f", media);
	}

}
