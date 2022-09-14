package application;

import javax.swing.text.Position;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler dois números inteiros M e N, e depois ler
            uma matriz de M linhas por N colunas contendo números inteiros,
            podendo haver repetições. Em seguida, ler um número inteiro X que
            pertence à matriz. Para cada ocorrência de X, mostrar os valores à
            esquerda, acima, à direita e abaixo de X, quando houver, conforme
            exemplo.

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Linha da matriz");
        int n = sc.nextInt();
        System.out.print("coluna da matriz");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];


        for (int i = 0; i < n ; i++) {
            for ( int j = 0 ; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for ( int j = 0 ; j < m; j++) {
                if(mat[i][j] == x) {
                    System.out.printf("Position %d,%d:%n",i,j);
                    //top
                    if(i-1 >= 0) {
                        System.out.println("Up : "+mat[i-1][j]);
                    }
                    //Left
                    if(j-1 >= 0) {
                        System.out.println("Left : "+mat[i][j-1]);
                    }
                    //Left
                    if(j+1  < m) {
                        System.out.println("Right : "+mat[i][j+1]);
                    }
                    //down
                    if (i+1 < n) {
                        System.out.println("Down : "+mat[i+1][j]);
                    }
                }
            }
        }
    }
}
