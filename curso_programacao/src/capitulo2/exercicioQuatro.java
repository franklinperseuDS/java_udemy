package capitulo2;

import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {
        System.out.println("**********Exercicio 04**********");
        System.out.println("leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\n" +
                "hora e calcula o salário desse funcionário");
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double calculoSalario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = "+ numeroFuncionario);
        System.out.println("SALARY = U$ "+ calculoSalario);

        sc.close();
    }
}
