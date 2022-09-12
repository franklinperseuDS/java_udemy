package capitulo3;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        System.out.println("Exercicio 04");
        System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\n" +
                "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");

        Scanner sc = new Scanner(System.in);
        int horarioInicio, horarioFim, tempoDeJogo;

        System.out.println("Digite o horario inicio do jogo");
        horarioInicio = sc.nextInt();

        System.out.println("Digite o horario do final do jogo");
        horarioFim = sc.nextInt();

        if(horarioInicio > horarioFim)
        {
            tempoDeJogo = (horarioFim+24) - horarioInicio;
        }
        else if(horarioInicio == horarioFim)
        {
            tempoDeJogo = 24;
        }
        else
        {
            tempoDeJogo = horarioFim - horarioInicio;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)",tempoDeJogo);

        sc.close();

    }
}
