package sessao06.exercicio;

import java.util.Scanner;

public class exercicioFor06 {
    public static void main(String[] args) {
        System.out.println("Exercicio 06 FOR");
        System.out.println("Ler um número inteiro N e calcular todos os seus divisores");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int x = 1 ; x <= N ; x++) {
            if (N % x == 0) {
                System.out.println(x);
            }
        }

        sc.close();
    }
}
