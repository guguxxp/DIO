/*Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
        Ao final, mostre os números e seus sucessores.*/

package com.dio.loops.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numAleatorio = new int[20];

        for (int i = 0; i < numAleatorio.length ; i++ ){
            int numero = rand.nextInt(100);
            numAleatorio[i] = numero;

        }

        System.out.println("\nNumeros Antecessores");
        for (int num : numAleatorio ) {
            System.out.print((num + 1) + " ");
        }

        System.out.println("\nNumeros aleatórios");
        for (int num : numAleatorio ) {
            System.out.print(num + " ");
        }

        System.out.println("\nNumeros Sucessores");
        for (int num : numAleatorio ) {
            System.out.print((num + 1) + " ");
        }

    }
}
