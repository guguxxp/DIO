/*Faça um Programa que peça as quatro notas de 10 alunos,
calcule e armazene num vetor a média de cada aluno,
imprima o número de alunos com média maior ou igual a 7.0.*/

package com.dio.loops.arrays.ExFixacao;

import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {

        final int ALUNOS = 10;
        final int QTDNOTAS = 4;

        Scanner scan = new Scanner(System.in);
        float[] media = new float[ALUNOS];
        float mediaAux;
        int alunosAciMedia = 0;

        for (int i = 0; i < ALUNOS; i++) { //loop para percorrer os alunos
            System.out.println("Digite as notas do aluno: " + (i+1));
            mediaAux = 0;
            for (int j = 0; j < QTDNOTAS; j++){ //loop para percorrer as notas
                mediaAux += scan.nextInt();
            }
            media[i] = mediaAux/QTDNOTAS; //armazenando as medias no vetor
        }

        for (float notaAluno: media ) {
            if (notaAluno >= 7)
                alunosAciMedia++;
        }

        System.out.println("QTD Alunos com nota maior ou igual a 7: " +  alunosAciMedia);
    }
}
