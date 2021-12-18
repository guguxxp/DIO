/*Faça um while que exiba um texto 5 vezes,
* com uma expressão de controle e uma variavel booleana*/

package com.dio.loops;

public class ExWhileTexto5x {
    public static void main(String[] args) {
        int cont = 0;
        while(true){
            System.out.println((cont + 1) + "- Texto do exercicio");
            cont++;

            if (cont >= 5)
                break;
        }

    }
}
