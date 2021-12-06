package com.dio.metodos.criacao;

import java.util.Scanner;

public class MainExercicio1 {
    public static void main(String[] args) {
        int num1, num2; //variáveis usadas para chamar o métodos da classe Calculadora
        int hora; //variavel usada para chamar o métodos da classe Mensagem
        float valor; //variavel usada para chamar métodos da classe Emprestimo
        int parcelas;//variavel usada para chamar métodos da classe Emprestimo


        Scanner scan = new Scanner(System.in);


        /*bloco de código para receber os valores usados em Calculadora*/
        System.out.println("Insira 2 valores para que sejam calculados");
        System.out.println("Primeiro Valor: ");
        num1 = scan.nextInt();
        System.out.println("Segundo Valor: ");
        num2 = scan.nextInt();

        /*Bloco de código para receber valores usados em Mensagem*/
        System.out.println("Insira a hora do dia entre 1 e 24");
        System.out.println("Hora: ");
        hora = scan.nextInt();

        /*Bloco de código para receber valores usados em Emprestimo*/
        System.out.println("Insira o valor do Empréstimo: ");
        valor = scan.nextInt();
        System.out.println("Insira o valor das parcelas entre 1 e 3: ");
        parcelas = scan.nextInt();


        /*Saídas de calculadora*/
        System.out.println("Soma: " + Calculadora.somar(num1,num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1,num2));
        System.out.println("Divisão: " + Calculadora.dividir(num1,num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1,num2));

        /*Saída de mensagem*/
        System.out.println(Mensagem.obterMensagem(hora));

        /*Saída de emprestimo*/
        System.out.println("Valor do empréstimo: " + valor);
        System.out.println("Valor das parcelas: " + parcelas);
        System.out.println("Valor final a ser pago: " + Emprestimo.getValorFinal(valor, parcelas));


    }
}
