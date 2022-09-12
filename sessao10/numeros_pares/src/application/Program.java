package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na\n" +
                "tela todos os números pares, e também a quantidade de números pares. \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vector = new int[n];


        for (int i = 0 ; i < vector.length ; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS PARES: ");
        int quantidade = 0;
        for (int i = 0 ; i < vector.length ; i++) {
            if(vector[i] % 2 == 0 ) {
                System.out.printf("%d ",vector[i]);
                quantidade += 1;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = "+quantidade);
    }

}
