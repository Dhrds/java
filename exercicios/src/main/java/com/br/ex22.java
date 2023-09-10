package com.br;

import java.util.Random;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int aleatorio = rand.nextInt(10);
        System.out.println("adivinhe o numero :");
        do{
            double numero = scanner.nextDouble();
            if (numero == aleatorio){break;}

        }while (true);
        scanner.close();
    }
}
