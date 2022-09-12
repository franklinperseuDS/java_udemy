package capitulo3;

import java.util.Scanner;

public class exercicioAula02 {
    public static void main(String[] args) {
        System.out.println("Exercicio 02 em aula");
        System.out.println("Switch case ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int dia = sc.nextInt();
        String diaDaSemana;
        switch (dia)
        {
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana = "segunda";
                break;
            case 3:
                diaDaSemana = "terça";
                break;
            case 4:
                diaDaSemana = "quarta";
                break;
            case 5:
                diaDaSemana = "quinta";
                break;
            case 6:
                diaDaSemana = "sexta";
                break;
            case 7:
                diaDaSemana = "sabado";
                break;
            default:
                diaDaSemana = "invalido";
                break;
        }

        System.out.println(diaDaSemana);
    }
}
