package com.br;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = scanner.nextInt();
        for (int i = 1;i < 11;i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
            }
        }

    }
