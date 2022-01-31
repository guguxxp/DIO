package Negocio;

import Negocio.Cliente;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Scanner;


@Getter
public class NovasContas {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public NovasContas() {
    }


    public void ContasIniciais(){
        clientes.add(new Cliente("Gustavo Strauss",
                27,
                "1111",
                1
                ));
        clientes.add(new Cliente("Gustavo Strauss",
                27,
                "1111",
                2
                ));
        clientes.add(new Cliente("Fabio Santos",
                23,
                "2222",
                2
                ));
        clientes.add(new Cliente("Carlos Rodrigues",
                35,
                "3333",
                1
                ));
    }

    public void NovaConta(){
        Scanner r = new Scanner(System.in);
        System.out.println("Digite o nome do Titular: ");
        String nome = r.next();
        System.out.println("Digite sua idade: ");
        int idade = r.nextInt();
        System.out.println("Digite seu CPF: ");
        String cpf = r.next();
        System.out.println("Digite o tipo de conta: 1 para CC e 2 para CP");
        int tipoConta = r.nextInt();

        clientes.add(new Cliente(nome, idade, cpf, tipoConta));

        System.out.println("Negocio.Conta criada com sucesso.");

    }
}
