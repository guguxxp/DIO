/*Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.*/


package com.dio.loops;

import java.util.Scanner;

public class ExMaiorMedia {
    public static void main(String[] args) {

        int nota;
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int contador = 0;
        float soma = 0;

        do {

            System.out.println("Digite a nota " + (contador+1) + ":");
            nota = scan.nextInt();
            if (nota > maior)
                maior = nota;  //alocando o valor maior
            soma += nota; //somando as notas para fazer a media
            contador++;


        }while(contador < 5);

        System.out.println("Maior nota: " + maior);
        System.out.println("Media = " + (soma/contador));



    }
}
