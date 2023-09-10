package com.br;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 0;i < 20;i++){
            System.out.println("digite um numero: ");
            int numero = scanner.nextInt();
            if(numero > 8){
                total ++;
            }
        }
        System.out.println(total);
        scanner.close();
    }

}
