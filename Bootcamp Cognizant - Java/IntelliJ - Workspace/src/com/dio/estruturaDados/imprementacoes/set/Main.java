package com.dio.estruturaDados.imprementacoes.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ferrari"));
        hashSetCarros.add(new Carro("Audi"));
        hashSetCarros.add(new Carro("BMW"));
        hashSetCarros.add(new Carro("JAC"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Peugeot"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Audi"));
        treeSetCarros.add(new Carro("BMW"));
        treeSetCarros.add(new Carro("JAC"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Peugeot"));

        System.out.println(treeSetCarros);



    }

}
