package vetores;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class aula90 {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler um n inteiro e ler quantos produtos tiverem com nome e preço de cada produto" +
                "\ne calcular a média do valor dos produtos");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for ( int i=0; i <vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
        }
        double sum = 0.0;
        for (int i = 0; i<vect.length; i++){
                sum+= vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
