package com.dio.loops;

import java.util.Scanner;

public class ExNomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "1";
        int idade;

        while (!nome.equals("0")){

            System.out.println("Insira o nome: ");
            nome = scan.next();

            System.out.println("Insira sua idade: ");
            idade = scan.nextInt();

        }
    }
}
