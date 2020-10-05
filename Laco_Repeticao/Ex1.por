programa {
	/*PARA
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00. */
	inclua biblioteca Util
	inclua biblioteca Matematica
	funcao inicio() {
		real salario = 0, somaSalario = 0.0, somaFilho = 0.0, percSalario = 0.0, maiorSalario = 0.0
		inteiro filho = 0, x, aux, cont = 0

		escreva("--PESQUISA---\n")

		para (x = 1; x <= 20; x++) {
			escreva(x, " - Salário: ")
			leia(salario)
			escreva(x, " - Número de filhos: ")
			leia(filho)
			somaSalario = somaSalario + salario
			somaFilho = somaFilho + filho

			se (maiorSalario < salario) {
				maiorSalario = salario
			}

			se (salario <= 100) {
				cont++
			}

			percSalario = Matematica.arredondar(((cont*100) / 20),2)
			
		}
		
		escreva("Média do salário = R$", somaSalario/20)
		escreva("\nMédia de filhos = ", somaFilho/20)
		escreva("\nMaior salário - R$", maiorSalario)
		escreva("\nPercentual de pessoas com salário até R$100,00 - ", percSalario, "%")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 935; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */