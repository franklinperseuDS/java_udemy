package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa\n" +
                "que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número\n" +
                "de homens. \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];
        for (int i = 0; i < pessoa.length; i++) {
//            sc.nextLine();
            System.out.printf("Altura da %da pessoa: ", (i + 1));
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", (i + 1));
            sc.nextLine();
            char sexo = Character.toUpperCase(sc.nextLine().charAt(0));

            pessoa[i] = new Pessoa(altura, sexo);
        }

        double menorAltura = pessoa[0].getHeight();
        double maiorAltura = pessoa[0].getHeight();
        double alturaMulheres = 0.0;
        int numeroMulheres = 0;
        int numeroHomens = 0;

        for (int i = 0; i < pessoa.length; i++) {
            if (maiorAltura < pessoa[i].getHeight()) {
                maiorAltura = pessoa[i].getHeight();
            }

            if (menorAltura > pessoa[i].getHeight()) {
                menorAltura = pessoa[i].getHeight();
            }


            if (pessoa[i].getGenero() == 'F') {
                alturaMulheres += pessoa[i].getHeight();
                numeroMulheres += 1;
            } else {
                numeroHomens += 1;
            }
        }

        double avgAlturaMulheres = alturaMulheres / (double) numeroMulheres;

        System.out.printf("Menor altura = %.2f%n",menorAltura);
        System.out.printf("Maior altura = %.2f%n",maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n" ,avgAlturaMulheres);
        System.out.printf("Numero de homens = %d",numeroHomens);
    }
}
