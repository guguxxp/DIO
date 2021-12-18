package com.dio.loops;

public class ExInterruptorFor {
    public static void main(String[] args) {

        for (int i = 1; i <=14 ; i++){
            if ((i == 12) || (i%2 != 0))
                continue;
            System.out.print(i + " ");
        }
    }
}
