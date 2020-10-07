import java.util.Scanner;

//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
public class Ex4 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + ", é par. Sua raiz quadrada é -> " + Math.sqrt(num));
        }
        if (num % 2 > 0) {
            System.out.println(num + ", é ímpar. Elevado ao quadrado -> " + Math.pow(num,2));
        }
    }
}
