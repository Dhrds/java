package com.br;

import java.util.Scanner;

public class ex6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        int numero = scanner.nextInt();
        System.out.print((numero-1) + " " + numero + " " + (numero+1));
    }
}
