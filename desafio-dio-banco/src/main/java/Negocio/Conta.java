package Negocio;

import lombok.Getter;

@Getter
public abstract class Conta implements iConta {
    private static int SEQUENCIAL = 0001;
    private static final int AGENCIA_PADRAO = 0001;

    protected int agencia;
    protected int numConta;
    protected double saldo;



    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        try {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Valor sacado: " + valor);
                System.out.println("Novo Saldo: " + this.saldo);
            }else {
                System.out.println("Valor não disponivel! ");
                System.out.println("Favor informar valor menor ou igual a: " + this.saldo);
            }


        } catch (NumberFormatException e){
            System.out.println("Favor utilizar apenas valores numéricos! ");
        }

    }

    @Override
    public void depositar(double valor) {
        try {
            if(valor < 0 ) System.out.println("Informe valor positivo para realizar o deposito");
            else {
                this.saldo += valor;
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("Valor depositado: " + valor);
                System.out.println("Novo Saldo: " + this.saldo);
            }
        }catch (NumberFormatException e){
            System.out.println("Favor utilizar apenas valores numéricos! ");
        }



    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            if (this.saldo < valor){
                System.out.println("Valor indisponível para transferir!");
                System.out.println("Informe um valor menor ou igual a: " + this.saldo);
            }else{
                this.sacar(valor);
                contaDestino.depositar(valor);
                System.out.println("Tranferencia realizada! ");
                System.out.println("Valor transferido " + valor + " para a conta: " + contaDestino.getNumConta());
                System.out.println("Novo saldo: " + this.saldo);
            }
        }catch (NumberFormatException e){
            System.out.println("Favor utilizar apenas valores numéricos! ");
        }
    }

    @Override
    public String toString() {
        return "" +  numConta ;
    }

    //checar pois pode estar imprimindo a mesma mensagem independente de ser CC ou CP
    public double getSaldo(Cliente cliente) {
        if (cliente.getTipoConta() == 1){
            cliente.getConta().imprimirExtrato();
        }else if (cliente.getTipoConta() == 2)
            cliente.getConta().imprimirExtrato();



        return saldo;
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Negocio.Conta: %d", this.numConta));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }



}
