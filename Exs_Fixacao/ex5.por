programa
{
	/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um
código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na
ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente
de 1 e 2, escreva uma mensagem informando que o código inválido.*/
	funcao inicio()
	{
		real vet[5], num
		inteiro i, codigo

		escreva("Valores do vetor: ")

		para (i = 0; i < 5; i++) {
			leia(num)
			vet[i] = num
		}

		escreva("Escolha o código: 0, 1 ou 2\n")
		leia(codigo)

		escolha (codigo) {
			caso 0:

			pare
			
			caso 1:
				para (i = 0; i < 5; i++) {
					escreva(vet[i], " ")
				}
			pare

			caso 2:
				para (i = 4; i > 0; i--) {
					escreva(vet[i], " ")
				}
			pare

			caso contrario:
			escreva("Código inválido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */