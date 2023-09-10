package com.br;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 0;i < 10;i++){
            System.out.println("digite um numero: ");
            double valor = scanner.nextDouble();
            total += valor;

        }
        System.out.println(total);
    }

}
