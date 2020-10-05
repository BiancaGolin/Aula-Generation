programa
{
	
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], i, j, dif, numero
		inteiro linhas = Util.numero_linhas(n1)
		inteiro colunas = Util.numero_colunas(n1)

		escreva("Números da matriz: ")
		
		para (i = 0; i < linhas; i++) {			
			para(j = 0; j < colunas; j++) {
				leia(numero)
				n1[i][j] = numero
			}
		}

		para (i = 0; i < linhas; i++) {			
			para(j = 0; j < colunas; j++) {
				leia(numero)
				n2[i][j] = numero
			}
		}

		para (i = 0; i < linhas; i++) {
			para(j = 0; j < colunas; j++) {
				dif = n1[i][j] - n2[i][j]
				m2[i][j] = dif
				escreva(m2[i][j], " ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */