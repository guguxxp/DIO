package com.dio.collections.set;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("ordem aleatoria: ");
        Set<Serie> series = new HashSet<>() {{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Desventuras em Serie", "Drama/Comedia", 40));
            add(new Serie("TLK", "Guerra", 60));
            add(new Serie("The 100", "Ficção", 60));
        }};
        for (Serie serie : series) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEstimado());
        }

        System.out.println("ordem insercao: ");
        Set<Serie> series1 = new LinkedHashSet<>() {{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("Desventuras em Serie", "Drama/Comedia", 40));
            add(new Serie("TLK", "Guerra", 60));
            add(new Serie("The 100", "Ficção", 60));
        }};
        for (Serie serie : series1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEstimado());
        }

        System.out.println("ordem natural (tempo)");
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie : series2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEstimado());
        }


    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEstimado;

    public Serie(String nome, String genero, Integer tempoEstimado) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEstimado = tempoEstimado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEstimado.equals(serie.tempoEstimado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEstimado);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEstimado=" + tempoEstimado +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEstimado() {
        return tempoEstimado;
    }

    @Override
    public int compareTo(Serie o) {
        int tempo = Integer.compare(this.getTempoEstimado(), o.getTempoEstimado());
        if (tempo != 0) return tempo;
        return  this.getGenero().compareTo(o.getGenero());
    }
}
