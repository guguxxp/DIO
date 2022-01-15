/*Faça um Programa que leia 20 números inteiros e armazene-os num
vetor. Armazene os números pares no vetor PAR e os números IMPARES
no vetor impar. Imprima os três vetores.*/

package com.dio.loops.arrays.ExFixacao;

import java.util.ArrayList;
import java.util.Scanner;

public class VetorParImpar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int vetorTotal[] = new int[5];
        ArrayList<Integer> vetorPar = new ArrayList<>();
        ArrayList<Integer> vetorImpar = new ArrayList<>();

        System.out.println("Digite os valores inteiros: ");
        for (int i = 0; i < vetorTotal.length; i++){
            System.out.println("Numero " + (i+1) + ": ");
            vetorTotal[i] = scan.nextInt();
            if (vetorTotal[i] % 2 == 0){
                vetorPar.add(vetorTotal[i]);
            }else{
                vetorImpar.add(vetorTotal[i]);
            }
        }

        System.out.print("\nVetor Total = ");
        for (int vetorT: vetorTotal  ) {
            System.out.print(vetorT + " ");
        }

        System.out.print("\nVetor Impar = ");
        for (int vetorI: vetorImpar  ) {
            System.out.print(vetorI + " ");
        }
        System.out.print("\nVetor Par = ");
        for (int vetorP: vetorPar  ) {
            System.out.print(vetorP + " ");
        }

    }
}
