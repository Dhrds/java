package com.br;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        int anos = 0;
        int meses = 0;
        int dias = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite quantos anos,meses e dias você tem? : ");
            try {
                anos = scanner.nextInt();
                meses = scanner.nextInt();
                dias = scanner.nextInt();

            }
            catch (Exception e){
                System.out.println("valor valido");
            }
            int valor = (anos * 365) + (meses * 30) + dias;
            System.out.println("A idade em dias é: " + valor + " dias");
        }
        while (anos == 0);

    }
}
