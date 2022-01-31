import Menu.StartMenu;
import Negocio.Cliente;
import Negocio.NovasContas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*NovasContas novas = new NovasContas();
        novas.ContasIniciais();

        System.out.println("Insira o CPF de acesso: ");
        Scanner r = new Scanner(System.in);
        String acesso = r.next();


        Cliente cliente = new Cliente();
        System.out.println("Teste " + cliente.getCpf());

        NovasContas nova = new NovasContas();
        System.out.println("Teste " + nova.getClientes());

        StartMenu start = new StartMenu();
        start.StartMenu(cliente);*/


        ArrayList<Cliente> clientes = new ArrayList<>();

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


        System.out.println("Insira o CPF de acesso: ");
        Scanner r = new Scanner(System.in);
        String acesso = r.next();


        Cliente cliente = new Cliente();
        System.out.println("Teste " + clientes.contains(cliente.getCpf().contains(acesso)));




    }
}
