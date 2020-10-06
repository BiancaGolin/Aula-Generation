/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x1, x2, y1, y2, d, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com x1, x2, y1 e y2, para calular a distancia entre eles:  ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		d = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
		res = (int) Math.sqrt(d);
		System.out.println("Distância entre os pontos => " + res);
	}

}
