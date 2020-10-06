/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b, c, d, r, s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		r = (int) Math.pow((a + b), 2);
		s = (int) Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
		System.out.println("D = " + d);

	}

}
