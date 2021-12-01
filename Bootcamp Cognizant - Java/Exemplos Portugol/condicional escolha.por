programa
{
	
	funcao inicio()
	{
		escreva("1 - Netflix \n2 - Amazon Prime \n3 - HBO GO \n4 - Sair\n")
		inteiro menu = 0
		escreva("sua opcao")
		leia(menu)

		escolha(menu){
			caso 1: //testa valor igual 1
			escreva("ok! abrindo netflix!")
			pare
			caso 2: //testa valor igual 2
			escreva("ok! abrindo amazon prime")
			pare
			caso 3: //testa valor igual 3
			escreva ("ok! abrindo HBO Go")
			pare
			caso 4: //testa valor igual 4
			escreva("saindo")
			pare
			
			caso contrario: 
			escreva("vc deve escolher entre as opções 1, 2, 3 ou 4")  
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */