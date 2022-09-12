package sessao06.exercicio;

import java.util.Scanner;

public class exercicioFor04 {
    public static void main(String[] args) {
        System.out.println("Exercicio for 04");
        System.out.println("Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo\n" +
                "segundo. Se o denominador for igual a zero, mostrar a mensagem \"divisao impossivel\"");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de repetições:");
        int N = sc.nextInt();

        for (int x= 0 ; x < N; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b == 0) {
                System.out.println("divisao impossivel");
            }else {
                double divisao = (double) a / b;
                System.out.printf("%.1f%n",divisao);
            }

        }

        sc.close();
    }
}
