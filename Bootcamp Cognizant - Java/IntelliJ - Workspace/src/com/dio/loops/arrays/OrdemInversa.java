/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.*/

package com.dio.loops.arrays;

public class OrdemInversa {
    public static void main(String[] args) {

        int vetor[] = {3, 6, 123, 4, -8, 35};
        int cont = 0;

        System.out.println("Vetor Original: ");
        while(cont < vetor.length){
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.println("\nVetor Invertido: ");
        for (int i = (vetor.length - 1) ; i >= 0; i--){
            System.out.print(vetor[i] + " ");

        }
    }
}
