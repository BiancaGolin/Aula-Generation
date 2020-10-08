import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as
características psicológicas dos indivíduos de uma região.
Para tanto, a cada uma das pessoas era perguntado: idade, sexo
(1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era
calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)*/
public class Ex4 {
    public static void main(String[] args) {
        int idade,sexo, temp, hab = 1, pessoaCalma = 0, mulherNervosa = 0, homemAgressivo = 0, outroCalmo = 0, pessoaNervosa40 = 0, pessoaCalma18 = 0;

        Scanner sc = new Scanner(System.in);

        while (hab <= 2) {
            System.out.println("Idade: ");
            idade = sc.nextInt();
            System.out.println("Sexo: 1-Feminino 2-Masculino 3-Outros");
            sexo = sc.nextInt();
            if (sexo < 1 || sexo > 3) {
                System.out.println("Código inválido. Insira um número válido.");
            }
            System.out.println("Como se sente: 1-Calmo/a 2-Nervoso/a 3-Agressivo/a");
            temp = sc.nextInt();
            if (temp < 1 || temp > 3) {
                System.out.println("Código inválido. Insira um número válido.");
            }
            switch (temp) {
                case 1:
                    if (sexo == 3) {
                        outroCalmo++;
                    }
                    if (idade < 18) {
                        pessoaCalma18++;
                    }
                    pessoaCalma++;
                break;
                case 2:
                    if (sexo == 1) {
                        mulherNervosa++;
                    }
                    if (idade > 40) {
                        pessoaNervosa40++;
                    }
                break;
                case 3:
                    if (sexo == 2) {
                        homemAgressivo++;
                    }
                default:
                    System.out.println("Número inválido");
            }
            hab++;
        }

        System.out.println("Número de pessoas calmas -> " + pessoaCalma);
        System.out.println("Número de mulheres nervosas -> " + mulherNervosa);
        System.out.println("Número de homens agressivos -> " + homemAgressivo);
        System.out.println("Número de outros calmos -> " + outroCalmo);
        System.out.println("Número de pessoas nervosas > 40 anos -> " + pessoaNervosa40);
        System.out.println("Número de pessoas calmas > 18 anos -> " + pessoaCalma18);
    }
}
