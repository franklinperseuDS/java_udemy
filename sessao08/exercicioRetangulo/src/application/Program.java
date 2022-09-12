package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Fazer um programa para ler os valores da largura e altura\n" +
                "de um retângulo. Em seguida, mostrar na tela o valor de\n" +
                "sua área, perímetro e diagonal. Usar uma classe como\n" +
                "mostrado no projeto ao lado");

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura do retângulo: ");
        retangulo.width = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        retangulo.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n",retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        sc.close();

    }
}
