package com.dio.estruturaDados.imprementacoes.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("BMW"));
        listCarros.add(new Carro("Audi"));
        listCarros.add(new Carro("Ferrari"));
        listCarros.add(new Carro("JAC"));

        System.out.println(listCarros);
        System.out.println(listCarros.contains(new Carro("BMW")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Ferrari")));
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        System.out.println(listCarros.remove(3));
        System.out.println(listCarros);



    }

}
