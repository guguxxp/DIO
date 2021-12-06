package com.dio.metodos.criacao;

public class Emprestimo {
    public static float getValorFinal(float valor, int parcelas){
        float valorFinal = 0;

        switch (parcelas){
            case 1: valorFinal = valor;
            break;
            case 2: valorFinal = valor + (valor * 0.1f);
            break;
            case 3: valorFinal = valor + (valor * 0.15f);
            break;
            case 4: valorFinal = valor + (valor * 0.2f);
            break;
            default:
                System.out.println("Número de parcelas inválidas0");
                break;
        }
        return valorFinal;
    }
}
