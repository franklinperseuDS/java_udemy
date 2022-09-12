package capitulo3;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        System.out.println("Exercicio 06");
        System.out.println("Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos\n" +
                "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\n" +
                "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser verificado entre os intervalos");
        double intervalo = sc.nextDouble();

        if(0 <= intervalo && intervalo >= 25){
            System.out.println("Intervalo (0,25]");
        } else if(25 < intervalo && intervalo >= 50){
            System.out.println("Intervalo (25,50]");
        }else if(50 < intervalo && intervalo >= 75){
            System.out.println("Intervalo (50,75]");
        }else if(75 < intervalo && intervalo >= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
