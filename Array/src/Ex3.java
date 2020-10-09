/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10
ela possui.*/

public class Ex3 {
    public static void main(String[] args) {
        int cont = 0;
        int mat[][] = new int[3][3];

        leMatriz(mat);
        imprimeMatriz(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j] > 10) {
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de números > 10: " + cont);
    }

    public static void leMatriz(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random()*25) + 1;
            }
        }
    }

    public static void imprimeMatriz(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
