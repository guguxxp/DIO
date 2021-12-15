/*
Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
*/

package com.dio.loops;

import java.util.Scanner;

public class ExTabuada {
    public static void main(String[] args) {
        int tabuada;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a tabuada que deseja calcular entre 1 e 10: ");
        tabuada = scan.nextInt();


        System.out.println("Tabuada de " + tabuada);

        for (int i = 0; i<= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }

    }
}
