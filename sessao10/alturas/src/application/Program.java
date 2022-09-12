package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na\n" +
                "tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,\n" +
                "bem como os nomes dessas pessoas caso houver. ");

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();



        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < pessoa.length ; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:%n",(i+1));
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            pessoa[i] = new Pessoa(name,age,height);

        }

        double sumHeight = 0.0;
        int menor = 0;
        for (int i = 0; i < pessoa.length ; i++) {
            sumHeight += pessoa[i].getHeight();
            if( pessoa[i].getAge() < 16) {
                menor += 1;
                }
        }

        double avgHeight = sumHeight / pessoa.length;

        double percentMenor =  ( (double) menor / (double) pessoa.length) * 100.00;

        System.out.printf("Altura média: %.2f%n",avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",percentMenor);
        for (int i = 0; i < pessoa.length ; i++) {

            if( pessoa[i].getAge() < 16) {
                System.out.println(pessoa[i].getName());
            }
        }



    }
}
