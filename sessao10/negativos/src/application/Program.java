package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros\n" +
                "e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numeros = sc.nextInt();

        int[] vect = new int[numeros];

        for (int i =0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros Negativos: ");
        for( int i = 0 ; i < vect.length ; i++) {
            if(vect[i] < 0)
                System.out.println(vect[i]);
        }
    }
}
