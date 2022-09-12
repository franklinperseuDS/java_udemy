package capitulo3;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 03 - condicionais");
        System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\n" +
                "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\n" +
                "ordem crescente ou decrescente.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro Valor:");
        int primeiroValor = sc.nextInt();
        System.out.println("Insira o segundo Valor:");
        int segundoValor = sc.nextInt();

        if( primeiroValor > segundoValor)
        {
            if ( primeiroValor%segundoValor == 0)
            {
                System.out.println("Sao Multiplos");
            }
            else
            {
                System.out.println("Nao sao Multiplos");
            }
        }else
        {
            if ( segundoValor%primeiroValor == 0)
            {
                System.out.println("Sao Multiplos");
            }
            else
            {
                System.out.println("Nao sao Multiplos");
            }
        }
                sc.close();
    }
}
