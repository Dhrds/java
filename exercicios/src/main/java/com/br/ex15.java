package com.br;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int idadeMenor = 99999;
        String nomeMenor = "";
        for (int i = 0;i < 3;i++){
            System.out.println("digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("digite seu nome: ");
            String nome = scanner.nextLine();
            if(idade < idadeMenor){
                idadeMenor = idade;
                nomeMenor = nome;
            }
        }
        System.out.println("a pessoa mais nova é " + nomeMenor);
    }

}
