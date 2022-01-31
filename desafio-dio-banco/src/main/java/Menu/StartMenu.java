package Menu;

import Negocio.Cliente;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartMenu {

    public void StartMenu(Cliente cliente) {

        int valor = 0;
        Scanner r = new Scanner(System.in);


        System.out.println(
                        "\n===========  SELECIONE UMA OPÇÃO  ==============\n" +
                        "1 - Consulta de Saldo em conta\n" +
                        "2 - Depositar valor em conta\n" +
                        "3 - Sacar valor em conta\n" +
                        "4 - Transferir valor para outra conta\n" +
                        "5 - Sair \n"
        );

        String opcao = r.next();

        switch (opcao){
            case "1": {
                System.out.println("==== CONSULTAR SALDO ====");
               // System.out.println("Saldo Atual: " + cliente.getConta().getSaldo());
                System.out.println("Saldo Atual: " + cliente.getTipoConta());
                StartMenu(cliente);
            }

            case "2": {
                System.out.println("==== DEPOSITAR VALOR ====");
                System.out.println("Informe o valor de depósito: ");
                valor = r.nextInt();
                cliente.getConta().depositar(valor);
                StartMenu(cliente);
            }

            case "3": {
                System.out.println("==== SACAR VALOR ====");
                System.out.println("Informe o valor de saque: ");
                valor = r.nextInt();
                cliente.getConta().sacar(valor);

            }

            case "4": {
                System.out.println("==== TRANSFERIR VALOR ====");
                System.out.println("Informe o valor de transferencia: ");
                valor = r.nextInt();
                System.out.println("Informe CPF de destino: ");
                String auxCPF;
                auxCPF = r.next();
                Cliente auxCliente = new Cliente();


                cliente.getConta().sacar(valor);
                auxCliente.getCpf().equals(auxCPF);
                auxCliente.getConta().depositar(valor);
                StartMenu(cliente);
            }

            case "5": {
                System.out.println("==== SAIR ====");
                System.out.println("Obrigado por utilizar os nossos serviços! ");
                break;
            }

            default: {
                System.out.println("==== OPÇÃO INVÁLIDA ====");
                StartMenu(cliente);
            }
        }

    }


}
