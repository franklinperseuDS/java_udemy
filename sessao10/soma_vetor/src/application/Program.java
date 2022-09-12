package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:\n" +
                "- Imprimir todos os elementos do vetor\n" +
                "- Mostrar na tela a soma e a média dos elementos do vetor");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for (int i =0 ; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        double sum = 0.0;
        for (int i =0 ; i < vector.length; i++) {
            System.out.printf("%.1f ",vector[i]);
            sum += vector[i];
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n",sum);
        double avg = sum / vector.length;
        System.out.printf("MEDIA = %.2f%n",avg);

    }

}
