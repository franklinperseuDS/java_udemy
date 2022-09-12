package sessao06.exercicio;

import java.util.Scanner;

public class exercicioFor02 {
    public static void main(String[] args) {
        System.out.println("Exercicio FOR 02");
        System.out.println("Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.\n" +
                "Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando\n" +
                "essas informações conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes que vamos verificar os valores:");
        int qtd = sc.nextInt();

        int in = 0, out = 0, teste;

        for(int x = 0; x < qtd; x++){
            System.out.println("Digite o valor a verificar");
            teste = sc.nextInt();
            if(10 <= teste && teste >= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.printf("%d in\n%d out",in,out);
        sc.close();
    }
}
