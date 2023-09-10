package com.br;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu saldo: ");
        float saldo = scanner.nextFloat();
        saldo *= 0.99F;
        System.out.println("seu saldo é: " + saldo);

    }
}
