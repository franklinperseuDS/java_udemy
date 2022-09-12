package capitulo3;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        System.out.println("Exercicio 07");
        System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\n" +
                "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\n" +
                "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).");

        Scanner sc = new Scanner(System.in);
        double pontoX, pontoY;
        System.out.println("Digite o valor das coordenadas");
        pontoX = sc.nextDouble();
        pontoY = sc.nextDouble();

        if (pontoY == pontoX && pontoX == 0.0){
            System.out.println("Origem");
        } else if (pontoX > 0 && pontoY > 0) {
            System.out.println("Q1");
        } else if (pontoX > 0 && pontoY < 0) {
            System.out.println("Q4");
        } else if (pontoX < 0 && pontoY > 0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q3");
        }

        sc.close();
    }
}
