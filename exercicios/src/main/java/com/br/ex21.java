package com.br;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("digite um numero positivo ou  numeros negativo para finalizar ");
        do{
            double numero = scanner.nextDouble();
            if (numero <0 ){break;}
            total += numero;
        }while (true);
        System.out.println(total);
    }
}
