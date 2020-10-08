import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int idade;
        int cont = 0, cont2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Idade: ");
        idade = sc.nextInt();
        while (idade != -99) {
            if (idade < 21) {
                cont++;
            }
            if (idade > 50) {
                cont2++;
            }

            idade = sc.nextInt();
        }
        System.out.println("Total de pessoas < 21 anos = " + cont);
        System.out.println("Total de pessoas > 50 anos = " + cont2);
    }
}
