import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int num, cont = 0;
        double soma = 0, media = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número qualquer: ");

        do {
        num = sc.nextInt();
            if (num % 3 == 0 && num != 0) {
                soma = soma + num;
                cont++;
            }
        } while (num != 0);

        System.out.println("Contador = " + cont);
        media = soma / cont;
        System.out.printf("Média: %.2f", media);
    }
}
