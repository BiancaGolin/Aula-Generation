programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		real vetor[5]
		inteiro i, elementos = u.numero_elementos(vetor), aux, maior = vetor[0]
		
		para (i = 0; i < elementos; i++) {
			escreva("Vetor: ")
			leia(vetor[i])
		}
		escreva("Notas: ")
		para (i = 0; i < elementos; i++) {			
			escreva(vetor[i], " ")
		}
		para (i = 0; i < elementos; i++) {
			se (vetor[i] > maior) {
				aux = maior
				maior = vetor[i]
				vetor[i] = aux
					
			}
			
		}
		escreva("\nMaior nota: ", maior)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */