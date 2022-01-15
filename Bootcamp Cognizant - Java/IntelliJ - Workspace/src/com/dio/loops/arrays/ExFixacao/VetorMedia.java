/*Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/

package com.dio.loops.arrays.ExFixacao;

import java.util.Scanner;

public class VetorMedia {

    public static void main(String[] args) {


        float soma = 0;
        int[] notas = new int[4];


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as notas: ");
        for (int i = 0; i < notas.length; i++){
            notas[i] = scan.nextInt();
            soma += notas[i];
        }

        System.out.println("Notas digitadas: ");
        for (int nota: notas ) {
            System.out.println(nota + " ");
        }

        System.out.println("Media = " + soma/notas.length);


    }

}
