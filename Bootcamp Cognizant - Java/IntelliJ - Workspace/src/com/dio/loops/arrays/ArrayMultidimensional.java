/*Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).*/

package com.dio.loops.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {

        Random rand = new Random();

        int[][] matrizAleatorio = new int[4][4];

//        int linha = 0;
//        int coluna = 0;

        for (int linha = 0; linha < matrizAleatorio.length; linha++){
            for (int coluna = 0; coluna < matrizAleatorio[linha].length; coluna++){
                matrizAleatorio[linha][coluna] = rand.nextInt(9);


            }
        }

        for ( int[] lin : matrizAleatorio ) {
            for ( int col: lin  ) {
                System.out.print(col + " ");

            }
            System.out.println();

        }

    }
}
