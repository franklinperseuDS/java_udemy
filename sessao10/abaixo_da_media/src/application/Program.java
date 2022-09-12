package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,\n" +
                "mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos\n" +
                "os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. \n");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("DIGITE UM NUMERO: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < vector.length; i++) {
            sum +=  vector[i] ;
        }

        double avg = sum / vector.length;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n",avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");

        for (int i = 0; i < vector.length; i++) {
            if( vector[i] < avg) {
                System.out.printf("%.1f%n",vector[i]);
            }
        }

    }
}
