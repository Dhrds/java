package com.br;

import java.util.Scanner;

public class ex23 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de termos da sequência de fibonacci: ");
        int seq = scanner.nextInt();
        int a = 0 , b = 1;
        for (int i =0;i < seq ;i++){
            System.out.print(a +",");
            int c = a + b ;
            a = b ;
            b = c;
        }
    }
}
