package com.dio.desafios;
import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int[] vetor = new int[5];
        int pares = 0;
        int impares = 0;
        int negativos = 0;
        int positivos = 0;

//continue a solução
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
            if((vetor[i] > 0) && ((vetor[i]%2 ) == 0) ){
                positivos++;
                pares++;
            }else if((vetor[i] > 0) && ((vetor[i]%2 ) != 0)){
                positivos++;
                impares++;
            }else if((vetor[i] < 0) && ((vetor[i]%2 ) == 0)) {
                negativos++;
                pares++;
            }else if((vetor[i] < 0) && ((vetor[i]%2 ) != 0)) {
                negativos++;
                impares++;
            }else{
                pares++;
            }


        }

//insira suas variaveis corretamente
            System.out.println( pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");
    }

}
