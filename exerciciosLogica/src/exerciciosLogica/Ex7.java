/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b, c, d, e, f, x, y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores para: a, b, c, d, e, f -> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("x = " + x + "\ny = " + y);
	}

}
