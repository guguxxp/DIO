package com.dio.variaveis;

public class Variaveis {

    public static void main(String[] args) {

        int i;
    //  int i;  // apresenta erro, pois já possúi uma variavel com o mesmo nome
        int I;
    //  int 1a; // não é possível devido a impossibilidade de iniciar a variavel com número
        int _la; //não segue as boas praticas de nome de variaveis
        int $aq; //não segue as boas práticas de nome de variáveis

        i = 4;
        I = 10;
        _la = 63;
        $aq = 32;

        final int j = 10;
        //j = 15; \\não é possível alterar o valor de uma constante
        int asrn24678md;
//        int asrn246 78md; //variavel com espaço no nome
        int asrn2$4678_md = 20; //não da erro, porém não é uma boa prática
//        int asrn2$46%78_md = 65; // caracter inválido no nome da variavel

        asrn24678md = 100;
        asrn2$4678_md = 300;

        int quantidadeProduto = 50;
//        int QuantidadeProduto; //não segue boas práticas
        final int NUMERO_TENTATIVAS = 5;
//        final int numeroTentativas = 5; //não segue as boas práticas
        int QUANTIDADE_OPCOES = 31;
//        int qtdProd; //não segue boas práticas

        System.out.println(i);
        System.out.println(I);
        System.out.println(_la);
        System.out.println($aq);
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
