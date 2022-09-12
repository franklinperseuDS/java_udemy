package capitulo2;

import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeiroNumero ;
        int segundoNumero;

        System.out.println("Primeiro numero");
        primeiroNumero = sc.nextInt();
        System.out.println("Segundo numero");
        segundoNumero = sc.nextInt();

        System.out.printf("SOMA = %d",primeiroNumero+segundoNumero);

        sc.close();
    }
}
