package sessao06.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicioFor03 {
    public static void main(String[] args) {
        System.out.println("Exercicio 03");
        System.out.println("Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste\n" +
                "de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes\n" +
                "conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem\n" +
                "peso 5.");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de casos de teste:");
        int n = sc.nextInt();
        double peso = 2;
        double calculo = 0, a, b ,c ;
        for (int x = 0 ; x< n; x++){
            System.out.printf("Digite os valores do conjunto %d ",x+1);
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

             calculo =  (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n",calculo);
        }

        sc.close();


    }
}
