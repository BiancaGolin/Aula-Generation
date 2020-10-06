/**
 * 
 */
package exerciciosLogica;

import java.util.Scanner;

/**
 * @author biancagolin
 *
 */
public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int totalSeg, segundos, horas, minutos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual foi a duração do evento (em segundos)?");
		totalSeg = sc.nextInt();
		
		horas = totalSeg / 3600;
		minutos = (totalSeg % 3600) / 60;
		segundos = (totalSeg % 3600) % 60;
		
		System.out.println("Duração do evento em horas: " + horas + "\nDuração do evento em minutos: " + minutos + "\nDuração do evento em segundos: " + segundos);
	}

}
