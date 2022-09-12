package capitulo3;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        System.out.println("Exercicio 05");
        System.out.println("Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A\n" +
                "seguir, calcule e mostre o valor da conta a pagar.\n");

        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double total;
        System.out.println("Digite o id do item: ");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        if(codigo == 1){
            total = quantidade * 4.00;
        }else if(codigo == 2){
            total = quantidade * 4.50;
        }else if(codigo == 3){
            total = quantidade * 5.00;
        }else if(codigo == 4){
            total = quantidade * 2.00;
        }else if(codigo == 5){
            total = quantidade * 1.50;
        }else{
            System.out.println("Item não cadastrado");
            total = 0;
        }

        System.out.printf("Total: R$ %.2f",total);


        sc.close();
    }
}
