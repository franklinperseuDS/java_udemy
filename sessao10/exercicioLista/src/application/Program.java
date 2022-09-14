package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de\n" +
                "N funcionários. Não deve haver repetição de id.\n");
        /*
         Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
        conforme exemplos.
        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
        ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
        aumento por porcentagem dada.
         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        System.out.println();
        List<Employee> list = new ArrayList<>();

        for (int i= 0; i < n; i++) {
            System.out.println("Employee #"+(i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id,name,salary);
            list.add(emp);
        }

        for (Employee em: list) {
            System.out.println(em);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the prcentage: ");
            double perc = sc.nextDouble();
            emp.increaseSalary(perc);
        }

        System.out.println();
        System.out.println("List of employees");
        for (Employee li: list) {
            System.out.println(li);

        }
    }
}
