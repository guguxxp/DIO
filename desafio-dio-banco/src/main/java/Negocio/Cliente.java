package Negocio;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Cliente {

    private String nome;
    private int idade;
    private String cpf;
    private int tipoConta;
    private Conta conta;

    public Cliente(){

    }

    public Cliente(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }

    public Cliente(String nome, int idade, String cpf, int tipoConta){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        if(this.tipoConta == 1)
            this.conta = new ContaCorrente();
        else if(this.tipoConta == 2)
            this.conta = new ContaPoupanca();
        else
            JOptionPane.showMessageDialog(null, "Tipo de conta inválida!");
    }


    @Override
    public String toString() {
        return this.nome;
    }
}
