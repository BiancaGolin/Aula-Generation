programa
{
	/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real precoProduto, pgtoDin, pgtoCred, pgtoDuas, pgtoTres
		inteiro codPgto

		escreva("Preço do produto (etiqueta): R$")
		leia(precoProduto)
		escreva("Escolha uma forma de pagamento: ")
		escreva("\n1 - À vista em dinheiro ou cheque, recebe 20% de desconto", "\n2 - À vista no cartão de crédito, recebe 15% de desconto", 
		"\n3 - Em duas vezes, preço normal de etiqueta sem juros", "\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		leia(codPgto)
		limpa()

		escolha(codPgto) {
			caso 1:
			pgtoDin = precoProduto*0.20
			escreva("Preço original: R$", precoProduto, ". Desconto: R$", pgtoDin, "\nValor total: R$", (precoProduto - pgtoDin))
			pare

			caso 2:
			pgtoCred = precoProduto*0.15
			escreva("Preço original: R$", precoProduto, ". Desconto: R$", pgtoCred, "\nValor total: R$", (precoProduto - pgtoCred))
			pare

			caso 3:
			pgtoDuas = precoProduto / 2
			escreva("Compra parcelada em 2x sem juros. Valor de cada parcela: \n1x de R$", pgtoDuas, "\n2x de R$", pgtoDuas,
			"\nValor total: R$", precoProduto)
			pare

			caso 4:
			pgtoTres = (precoProduto*0.10) + precoProduto
			escreva("Compra parcelada em 3x (10% de juros). Valor de cada parcela: \n1x de R$", mat.arredondar(pgtoTres / 3, 2), "\n2x de R$", 
			mat.arredondar(pgtoTres / 3, 2), "\n3x de R$", mat.arredondar(pgtoTres / 3, 2), "\nValor total: R$", pgtoTres)

			pare

			caso contrario:
			escreva("Opção inválida.") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1920; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */