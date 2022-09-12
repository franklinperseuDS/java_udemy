package capitulo3;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        System.out.println("Exercicio if-else 01");
        System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um Número: ");
        int numero = sc.nextInt();
        if( numero > 0 )
        {
            System.out.println("NAO NEGATIVO");
        }
        else
        {
            System.out.println("NEGATIVO");
        }

        sc.close();

    }

}
