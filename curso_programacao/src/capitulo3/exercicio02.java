package capitulo3;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        System.out.println("Exercicio 02 - condicional");
        System.out.println("Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = sc.nextInt();

        if( numero % 2 == 0)
        {
            System.out.println("PAR");
        }
        else
        {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
