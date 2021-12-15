/*Par e Ímpar: Faça um programa que peça N números inteiros.
        Calcule e mostre a quantidade de números pares e a quantidade de números impares.*/

package com.dio.loops;

import java.util.Scanner;

public class ExParImpar {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        int iteracao, numero;
        int par = 0;
        int impar = 0;
        int contador = 0;

        System.out.println("Digite a quantidade de numeros que deseja ler: ");
        iteracao = scan.nextInt();

        do {

            System.out.println("Digite o numero " + (contador+1) + ":");
            numero = scan.nextInt();
            if (numero%2 == 0)
                par++;
            if (numero%2 != 0)
                impar++;
            contador++;

        }while(contador < iteracao);

        System.out.println("Quantidade de numeros par: " + par);
        System.out.println("Quantidade de numeros impar: " + impar);
    }
}
