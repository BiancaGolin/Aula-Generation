//2- Ler 10 números e
// imprimir quantos são pares e quantos são ímpares. (FOR)

public class Ex2 {
    public static void main(String[] args) {
        int num, contP = 0, contI = 0;
        int vetor[] = new int[10];

        leVetor(vetor);
        imprimeVetor(vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contP++;
            } else {
                contI++;
            }
        }
        System.out.println("\nPares -> " + contP);
        System.out.println("Impares -> " + contI);
    }
    public static void leVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random()*50) +1;
        }
    }

    public static void imprimeVetor(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}

