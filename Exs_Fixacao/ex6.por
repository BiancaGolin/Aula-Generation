programa
{
	/*Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.*/
	funcao inicio()
	{
		inteiro vet[3], matriz[3][3], nVet, linha, coluna, i, j, multiplicacao = 0, mat[3][3]

		escreva("Preencha o vetor de inteiros: \n")
		para (i = 0; i < 3; i++) {
			leia(nVet)
			vet[i] = nVet
		}
		escreva("Preencha a matriz de inteiros: \n")
		para (i = 0; i < 3; i++) {		
			para (j = 0; j < 3; j++) {
				leia(linha)
				matriz[i][j] = linha
			}
		}

		para (i = 0; i < 3; i++) {
			
			para(j = 0; j < 3; j++) {
				multiplicacao = matriz[i][j] * vet[i]
				mat[i][j] = multiplicacao
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 7, 10, 3}-{matriz, 7, 18, 6}-{mat, 7, 78, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */