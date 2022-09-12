package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média\n" +
                "aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for\n" +
                "digitado, mostrar a mensagem \"NENHUM NUMERO PAR\" ");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextInt();
        }

        int contagem = 0;
        double sum = 0, avg ;

        for (int i = 0; i < vector.length; i++) {
            if ( vector[i] % 2 ==0) {
                sum += vector[i];
                contagem += 1;
            }
        }

        if (contagem > 0) {
            avg = sum / contagem;
            System.out.printf("MEDIA DOS PARES = %.1f",avg);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
