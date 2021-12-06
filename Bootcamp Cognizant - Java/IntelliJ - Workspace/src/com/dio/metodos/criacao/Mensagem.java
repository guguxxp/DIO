package com.dio.metodos.criacao;

public class Mensagem {
    public static String obterMensagem(int hora){
        String mensagem;
        if(hora >= 5 && hora <=11){
            mensagem =  "Bom dia";
        }else{
            if(hora >= 12 && hora <= 17){
                mensagem = "Bom tarde";
            }else{
                if((hora >= 18 && hora <= 24) || (hora >=1 && hora <=4)){
                    mensagem = "Boa noite";
                }else {
                    mensagem = "Hora inválida";
                }
            }
        }
        return mensagem;
    }
}
