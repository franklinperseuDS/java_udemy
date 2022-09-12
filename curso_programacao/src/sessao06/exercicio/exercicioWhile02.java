package sessao06.exercicio;

import java.util.Scanner;

public class exercicioWhile02 {
    public static void main(String[] args) {
        System.out.println("Exercicio 02");
        System.out.println("Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema\n" +
                "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo\n" +
                "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)");

        Scanner sc = new Scanner(System.in);
        System.out.println("digite a coordenada X");
        int coordenadaX  = sc.nextInt();
        System.out.println("digite a coordenada Y");
        int coordenadaY =  sc.nextInt();

        while ( coordenadaY != 0 || coordenadaX != 0)
        {
            if( coordenadaX > 0 && coordenadaY > 0 )
            {
                System.out.println("primeiro");
            }else if( coordenadaX > 0 && coordenadaY < 0) {
                System.out.println("quarto");
            }else if( coordenadaX < 0 && coordenadaY > 0){
                System.out.println("segundo");
            }else {
                System.out.println("terceiro");
            }

            System.out.println("digite a coordenada X");
             coordenadaX  = sc.nextInt();
            System.out.println("digite a coordenada Y");
             coordenadaY =  sc.nextInt();
        }

        sc.close();
    }

}
