programa
{
	
	funcao inicio()
	{
		real jan, fev, mar, abr, media, total
		cadeia func
		
		escreva("nome do func:")
		leia(func)

		escreva("insira vendas de jan: ")
		leia(jan)
		escreva("insira vendas de fev: ")
		leia(fev)
		escreva("insira vendas de mar: ")
		leia(mar)
		escreva("insira vendas de abr: ")
		leia(abr)

		total = jan+fev+mar+abr
		media = total/4
		escreva("total de vendas do func " + func + " : " + total)
		escreva("\nmedia de vendas do func " + func + " : " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */