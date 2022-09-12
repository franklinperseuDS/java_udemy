package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes\n" +
                "devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome\n" +
                "da pessoa mais velha. ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0 ; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d pessoa: %n", (i+1));
            System.out.print("NOME: ");
            String nome = sc.nextLine();
            System.out.print("IDADE: ");
            int idade = sc.nextInt();

            pessoa[i] = new Pessoa(nome,idade);
        }

        int maisVelho = 0;

        for(int i=0; i < pessoa.length -1 ; i++) {
            if(pessoa[i].getIdade() < pessoa[i+1].getIdade()) {
                maisVelho = i+1;
            }
        }

        System.out.println("PESSOA MAIS VELHA: "+pessoa[maisVelho].getNome());

    }
}
