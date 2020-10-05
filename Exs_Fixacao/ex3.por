programa
{
	/*Escrever um programa que leia uma quantidade desconhecida de números e conte
quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
entrada de dados deve terminar quando for lido um número negativo.*/
	funcao inicio()
	{
		inteiro numero, cont = 0, cont1 = 0, cont2 = 0, cont3 = 0
		escreva("Insira valores: ")
		faca {
		leia(numero)
		se (numero <= 25 e numero > 0) {
			cont++
			escreva("Quantidade de números no intervalo [0-25]: ", cont, "\n")
		}
		se (numero >= 26 e numero <= 50) {
			cont1++
			escreva("Quantidade de números no intervalo [26-50]: ", cont1, "\n")
		}
		se (numero >= 51 e numero <= 75) {
			cont2++
			escreva("Quantidade de números no intervalo [51-75]: ", cont2, "\n")
		}
		se (numero >= 76 e numero <= 100) {
			cont3++
			escreva("Quantidade de números no intervalo [76-100]: ", cont3, "\n")
		}
			
		} enquanto (numero > 0)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 867; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */