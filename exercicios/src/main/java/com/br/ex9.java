package com.br;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();
        scanner.close();
        for (int i = 0;i<10;i++){
            System.out.println(nome);
        }
    }

}
