package Application;

import Entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em\n" +
                "seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o\n" +
                "salário do funcionário com base em uma porcentagem dada (somente o salário bruto é\n" +
                "afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe\n" +
                "projetada abaixo.");
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("NAME:");
        funcionario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();


        System.out.println("Employee : "+funcionario);

        System.out.print("Wich percentage to increase salary? ");
        double add = sc.nextDouble();
        funcionario.increaseSalary(add);

        System.out.print("Updated data: "+funcionario);
    }
}
