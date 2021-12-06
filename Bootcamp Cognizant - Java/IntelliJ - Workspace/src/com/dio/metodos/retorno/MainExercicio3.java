package com.dio.metodos.retorno;

public class MainExercicio3 {
    public static void main(String[] args) {

        System.out.println("Valores Exercicio Quadrilatero com retorno");
        double areaQuadrado, areaRetangulo, areaTrapezio, areaLosango;

        areaQuadrado = Quadrilatero.area(4);
        areaRetangulo = Quadrilatero.area(5d,5d);
        areaTrapezio = Quadrilatero.area(7,8,9);
        areaLosango = Quadrilatero.area(6f, 6f);


        System.out.println("Quadrado: " + areaQuadrado);
        System.out.println("Retangulo: " + areaRetangulo);
        System.out.println("Trapézio: " + areaTrapezio);
        System.out.println("Losango: " + areaLosango);
    }
}
