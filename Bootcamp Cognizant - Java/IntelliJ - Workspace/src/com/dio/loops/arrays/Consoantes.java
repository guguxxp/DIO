/*Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.*/


package com.dio.loops.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantidadeConsoantes = 0;
        String consoantes[] = new String[6];

        int count = 0;
        do{
            System.out.println("Digite a letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                quantidadeConsoantes++;

            }
            count++;

        }while(count < consoantes.length);

        for ( String consoante : consoantes ) {
            if (consoante != null)
                System.out.print(consoante + " \n");
            
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);



    }
}
