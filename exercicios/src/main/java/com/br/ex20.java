package com.br;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        for (int i = 0;i < 5;i++){
            System.out.println("digite um numero: ");
            int numero = scanner.nextInt();
            if(numero >= 0 && numero <= 100){
                total1 ++;
            } else if (numero >=101 && numero <= 200) {
                total2 ++;
            } else if (numero > 200) {
                total3 ++;
            }
        }
        System.out.println("entre 0 e 100 :" + total1);
        System.out.println("entre 101 e 200 :" + total2);
        System.out.println("maior que 200 :" + total3);

        scanner.close();
    }

}