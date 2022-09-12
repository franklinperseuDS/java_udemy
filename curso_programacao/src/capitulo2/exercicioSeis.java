package capitulo2;

import java.util.Scanner;

public class exercicioSeis {

    public static void main(String[] args) {
        System.out.println("**********Exercicio 05**********");
        System.out.println("um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\n" +
                "mostre:\n" +
                "a) a área do triângulo retângulo que tem A por base e C por altura.\n" +
                "b) a área do círculo de raio C. (pi = 3.14159)\n" +
                "c) a área do trapézio que tem A e B por bases e C por altura.\n" +
                "d) a área do quadrado que tem lado B.\n" +
                "e) a área do retângulo que tem lados A e B.");

        Scanner sc = new Scanner(System.in);

        double primeiro, segundo , terceiro , triangulo, circulo, trapezio, quadrado, retangulo;

        primeiro = sc.nextDouble();
        segundo = sc.nextDouble();
        terceiro = sc.nextDouble();


        triangulo = (primeiro * terceiro)/2;
        circulo = 3.14159 * Math.pow( terceiro, 2.0);
        trapezio = ((primeiro + segundo) * terceiro) / 2;
        quadrado = Math.pow(segundo, 2.0);
        retangulo = primeiro * segundo;

        System.out.printf("TRIANGULO: %.3f \n",triangulo);
        System.out.printf("CIRCULO: %.3f \n",circulo);
        System.out.printf("TRAPEZIO: %.3f \n",trapezio);
        System.out.printf("QUADRADO: %.3f \n",quadrado);
        System.out.printf("RETANGULO: %.3f \n",retangulo);

        sc.close();

    }
}
