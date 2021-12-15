/*Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120*/

package com.dio.loops;

import java.util.Scanner;

public class ExFatorial {
    public static void main(String[] args) {
        int fatorial;
        int resultado = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número para calcular o fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i > 0; i--){
            resultado *= i;

        }
        System.out.println(fatorial + "! = " + resultado);
    }
}
