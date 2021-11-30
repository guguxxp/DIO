//programa do bootcamp DIO
//funcao calcular a media do aluno e informar se foi aprovado ou nao
//Autor: Gustavo Strauss

programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, n4, media
		cadeia aluno
		
		escreva("nome do aluno:")
		leia(aluno)

		escreva("insira a N1:")
		leia(n1)
		escreva("insira a N2:")
		leia(n2)
		escreva("insira a N3:")
		leia(n3)
		escreva("insira a N4:")
		leia(n4)

		//calcular media
		media = (n1+n2+n3+n4)/4
		
		escreva("sua media e: " + media)

		//verifica se a media é maior ou igual a 7
		se(media >=7){
			escreva("\nParabens vc foi aprovado")		
		}
		//condicao caso nao seja verdadeiro
		senao {
			escreva("\nVoce foi reprovado")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */