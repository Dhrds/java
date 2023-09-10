package com.br;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] arg){
        Scanner scanner = new  Scanner(System.in);
        System.out.print("digite o codigo do produto: ");
        int cod1 = scanner.nextInt();
        System.out.print("Digite o valor da peça 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidade1 = scanner.nextInt();

        System.out.print("digite o codigo do produto: ");
        int cod2 = scanner.nextInt();
        System.out.print("Digite o valor da peça 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidade2 = scanner.nextInt();

        System.out.print("valor do ipi: ");
        double ipi = scanner.nextDouble();

        double total = (valor1*quantidade1 + valor2*quantidade2)*(ipi/100 +1);

        System.out.println("valor total: R$" + total);

        }
    }
