package com.br;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 0;i < 20;i++){
            System.out.println("digite sua idade: ");
            int valor = scanner.nextInt();
            total += valor;

        }
        total = total/20;
        System.out.println(total);
    }

}
