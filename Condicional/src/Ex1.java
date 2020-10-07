import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Ex1 {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números inteiros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Maior número é: " + n1);
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("Maior número é: " + n2);
        }
       else {
            System.out.println("Maior número é: " + n3);
        }
    }
}
