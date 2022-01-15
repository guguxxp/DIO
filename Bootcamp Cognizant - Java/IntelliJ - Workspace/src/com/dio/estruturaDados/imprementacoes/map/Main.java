package com.dio.estruturaDados.imprementacoes.map;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Gustavo");
        aluno.put("Idade", "27");
        aluno.put("Media", "7.5");
        aluno.put("Curso", "SI");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        System.out.println(listaAlunos);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Taina");
        aluno2.put("Idade", "22");
        aluno2.put("Media", "8.6");
        aluno2.put("Curso", "TO");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));


    }

}
