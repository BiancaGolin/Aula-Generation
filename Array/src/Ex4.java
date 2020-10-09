/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int escolha, constante;
        float matA[][] = new float[2][2];
        float matB[][] = new float[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("O que você deseja fazer? \n1-Somar duas matrizes\n2-Subtrair a primeira matriz da segunda\n3-Adicionar uma constante as duas matrizes\n4-Imprimir as matrizes");
        escolha = sc.nextInt();

        leMatriz(matA);
        leMatriz(matB);

        switch(escolha) {
            case 1:
                float matC[][] = new float[2][2];
                for (int i = 0; i < matC.length; i++) {
                    for (int j = 0; j < matC.length; j++) {
                        matC[i][j] = matA[i][j] + matB[i][j];
                    }
                }
                imprimeMatriz(matC);
                break;
            case 2:
                float matD[][] = new float[2][2];
                for (int i = 0; i < matD.length; i++) {
                    for (int j = 0; j < matD.length; j++) {
                        matD[i][j] = matA[i][j] - matB[i][j];
                    }
                }
                imprimeMatriz(matD);
                break;
            case 3:
                System.out.println("Insira um valor para ser somado à matriz: ");
                constante = sc.nextInt();
                for (int i = 0; i < matA.length; i++) {
                    for (int j = 0; j < matA.length; j++) {
                        matA[i][j] += constante;
                    }
                }
                for (int i = 0; i < matB.length; i++) {
                    for (int j = 0; j < matB.length; j++) {
                        matB[i][j] += constante;
                    }
                }
                System.out.println("==MATRIZ A==");
                imprimeMatriz(matA);
                System.out.println("==MATRIZ B==");
                imprimeMatriz(matB);
                break;
            case 4:
                imprimeMatriz(matA);
                imprimeMatriz(matB);
                break;
            default:
                System.out.println("Número inválido");
        }

    }
    public static void leMatriz(float mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (float) ((Math.random()*25) + 1);
            }
        }
    }

    public static void imprimeMatriz(float mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("%.2f", mat[i][j], " ");
            }
            System.out.println(" ");
        }
    }
}
