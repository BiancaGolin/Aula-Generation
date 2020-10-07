import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.
public class Ex2 {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números inteiros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3 && n2 < n3) {
            System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
        }
        if (n1 < n3 && n1 < n2 && n3 < n2) {
            System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
        }
        if (n2 < n1 && n2 < n3 && n1 < n3) {
            System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
        }
        if (n2 < n3 && n2 < n1 && n3 < n1) {
            System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
        }
        if (n3 < n1 && n3 < n2 && n1 < n2) {
            System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
        }
        if (n3 < n2 && n3 < n1 && n2 < n1) {
            System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
        }
    }
}
