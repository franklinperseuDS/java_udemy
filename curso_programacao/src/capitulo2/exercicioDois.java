package capitulo2;

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        System.out.println("Exercicio 2 \nLer o Valor do raio de um circulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio ex: 0,00:");
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double calculo = pi*Math.pow(raio,  2.00);
        System.out.printf("A= %.4f",calculo);

        sc.close();
    }
}
