programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro numero, i, vetor[10], soma = 0, elementos = Util.numero_elementos(vetor), maior = vetor[0], aux, cont = 0

		para (i = 0; i < 10; i++) {
			numero = Util.sorteia(1, 6)
			vetor[i] = numero
			escreva(vetor[i], " ")
		}

		para (i = 0; i < 10; i++) {
			soma = soma + vetor[i]
		}
		escreva("\nMédia: ", soma/elementos)

		para (i = 0; i < elementos; i++) {
			se (vetor[i] > maior) {
				maior = vetor[i]
				//aux = maior
				//maior = vetor[i]
				//vetor[i] = aux
			} 
		}

		para (i = 0; i < elementos; i++) {
			se (vetor[i] == maior) {
					cont++
				}
		}
		escreva("\nMaior valor: ", maior, ". Ocorrências: ", cont)
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */