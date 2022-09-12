package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String args[]) {
        System.out.println("Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela\n" +
                "o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,\n" +
                "considerando a primeira posição como 0 (zero)");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i= 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
        }
        int posicao = 0;
        double maior = vector[0];
        for (int i = 0 ; i < vector.length - 1; i++) {
            if(vector[i] < vector[i+1]) {
                maior = vector[i+1];
                posicao = i+1;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n",maior);
        System.out.println("POSICAO DO MAIOR VALOR = "+posicao);
        sc.close();
    }
}
