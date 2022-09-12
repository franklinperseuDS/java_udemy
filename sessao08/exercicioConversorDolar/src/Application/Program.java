package Application;

import Entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por\n" +
                "uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda\n" +
                "que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter\n" +
                "para ser responsável pelos cálculos.");

        Scanner sc = new Scanner(System.in);



        System.out.print("What is the dollar price? ");
        double currency = sc.nextDouble();

        System.out.print("How Many dollars will br bought? ");
        double bought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f",CurrencyConverter.ConvertDolarToReal(currency,bought));
    }
}
