package capitulo2;

import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        System.out.println("**********Exercicio 03**********");
        System.out.println("Calcular a diferença entre o produto de quatro numeros inteiros");
        Scanner sc = new Scanner(System.in);
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int terceiroNumero = sc.nextInt();
        int quartoNumero = sc.nextInt();

        int calculo = (primeiroNumero * segundoNumero) - ( terceiroNumero * quartoNumero);

        System.out.printf("DIFERENCA = %d",calculo);

        sc.close();
    }
}
