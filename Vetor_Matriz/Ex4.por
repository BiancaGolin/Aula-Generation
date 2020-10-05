programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro matriz[3][3], i, j, soma = 0, numero, somaDiagonal = 0
		inteiro linhas = Util.numero_linhas(matriz)
		inteiro colunas = Util.numero_colunas(matriz)

		escreva("Números da matriz: ")
		
		para (i = 0; i < linhas; i++) {			
			para(j = 0; j < colunas; j++) {
				leia(numero)
				matriz[i][j] = numero
			}
		}

		para (i = 0; i < linhas; i++) {
			para(j = 0; j < colunas; j++) {
				escreva(matriz[i][j], " ")
			}
			escreva("\n")
		}

		para (i = 0; i < linhas; i++) {
			para(j = 0; j < colunas; j++) {
				soma = soma + matriz[i][j]
				
			}				
		}
		
			escreva("Soma dos elementos -> ", soma, " ")
			escreva("\n") 

		para (i = 0; i < linhas; i++) {
				somaDiagonal = somaDiagonal + matriz[i][i]				
		}
			escreva("Soma da diagonal -> ", somaDiagonal, " ")
			escreva("\n") 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */