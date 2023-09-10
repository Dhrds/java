package com.br;

import java.util.Scanner;

public class ex5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor do salário mínimo e depois seu salário");
        double minimo = scanner.nextDouble();
        double salario = scanner.nextDouble();
        double qnt = salario/minimo;
        System.out.print(qnt + " sm=R$ " + minimo);
    }
}
