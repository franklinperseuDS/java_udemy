package sessao06.exercicio;

import java.util.Scanner;

public class exercicioFor05 {
    public static void main(String[] args) {
        System.out.println("Exercicio 05 for");
        System.out.println("Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.\n" +
                "Lembrando que, por definição, fatorial de 0 é 1.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser calculado o fatorial");
        int N = sc.nextInt();

        int fatorial = 1;

            for (int x = 0; x < N; x++) {
                fatorial *= N - x;
            }

        System.out.println(fatorial);
            sc.close();

    }
}
