package sessao06.exercicio;

import java.util.Scanner;

public class exercicioFor01 {
    public static void main(String[] args) {
        System.out.println("Exercicio 01 do FOR");
        System.out.println("Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o\n" +
                "X, se for o caso");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if(numero > 1 && numero < 100){
            for(int x = 0; x < numero; x++){
                if(x % 2 != 0){
                    System.out.println(x);
                }

            }
        }

        sc.close();

    }
}
