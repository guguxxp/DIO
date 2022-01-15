package com.dio.estruturaDados.imprementacoes.equalshashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("BMW"));
        listaCarros.add(new Carro("Ferrari"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("BMW").hashCode());
        System.out.println(new Carro("Ford1").hashCode());


        //testando se o indice 0 é igual a marca Ford
        System.out.println(listaCarros.get(0).getMarca().equals("Ford"));

        //testando se o indice 1 é igual a Ford
        System.out.println(listaCarros.get(1).getMarca().equals("Ford"));

        //testando se o indice 1 é igual a BMW
        System.out.println(listaCarros.get(1).getMarca().equals("BMW"));


        System.out.print(listaCarros.toString());




    }

}
