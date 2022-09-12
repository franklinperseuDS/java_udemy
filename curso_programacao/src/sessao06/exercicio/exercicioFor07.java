package sessao06.exercicio;

import java.util.Scanner;

public class exercicioFor07 {
    public static void main(String[] args) {
        System.out.println("Exercicio 07 For");
        System.out.println("Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,\n" +
                "começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme\n" +
                "exemplo");

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int x = 1; x <= N; x++) {
            System.out.printf("%d %.0f %.0f%n",x,Math.pow((double)x,2.0),Math.pow((double)x,3.0));
        }

        sc.close();
    }
}
