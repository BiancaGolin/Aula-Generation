import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int num, soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        do {
            num = sc.nextInt();
            soma = soma + num;
        } while (num != 0);
        System.out.println(soma);
    }
}

