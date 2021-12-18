/*Faça um for que mostra os números  de 3 a 11,
* sendo que itere de 2 em 2. Entretando, quando o loop
* passar pelo 7, este não deve ser exibido*/

package com.dio.loops;

public class ExIncrementoDe2 {
    public static void main(String[] args) {


        for (int i = 3; i <=11; i+=2){
            /*if (i != 7) //resolução sem interruptor
                System.out.print(i + " ");
            */
            if (i == 7){ //resolução com interruptor
                continue;
            }System.out.print(i + " ");

        }

    }
}
