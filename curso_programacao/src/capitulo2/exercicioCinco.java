package capitulo2;

import java.util.Scanner;

public class exercicioCinco {
    public static void main(String[] args) {
        System.out.println("**********Exercicio 05**********");
        System.out.println("ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\n" +
                "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");
        Scanner sc = new Scanner(System.in);
        int codigoPeca01 = sc.nextInt();
        int numeroPeca01 = sc.nextInt();
        double valorPeca01 = sc.nextDouble();

        int codigoPeca02 = sc.nextInt();
        int numeroPeca02 = sc.nextInt();
        double valorPeca02 = sc.nextDouble();

        double total =  numeroPeca01 * valorPeca01 + numeroPeca02 * valorPeca02;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);


        sc.close();
    }
}
