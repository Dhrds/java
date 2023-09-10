package com.br;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("digite a quantidade de vezes: ");
        int qtd = scanner.nextInt();
        scanner.close();
        for (int i = 0;i < qtd;i++){
            System.out.println(nome);
        }
    }

}