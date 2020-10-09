/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
public class Ex2 {
    public static void main(String[] args) {
        int somaPar = 0, cont = 0;
        int vet[] = new int[6];
        System.out.println("==VETOR==");
        leVetor(vet);
        imprimeVetor(vet);

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print("\nPar: " + vet[i] + " ");
                somaPar += vet[i];
            }
            else {
                System.out.print("\nÍmpar: " + vet[i] + " ");
                cont++;
            }
        }
        System.out.println("\nSoma números pares -> " + somaPar);
        System.out.println("Quantidade de números ímpares -> " + cont);
    }

    public static void leVetor (int vet[]) {
        for (int i = 0; i < vet.length; i++) {
           vet[i] = (int) (Math.random()*20) + 1;
        }
    }

    public static void imprimeVetor (int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
