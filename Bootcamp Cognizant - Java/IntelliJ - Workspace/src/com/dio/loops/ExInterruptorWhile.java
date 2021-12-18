package com.dio.loops;

public class ExInterruptorWhile {
    public static void main(String[] args) {

        int cont = 1;
        while(cont <= 14){
            if ((cont == 12) || (cont%2 != 0)){
                cont++;
                continue;
            }
            System.out.print(cont + " ");
            cont++;
        }
    }
}
